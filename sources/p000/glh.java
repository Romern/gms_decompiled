package p000;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.auth.frp.FrpSnapshot;
import com.google.android.gms.auth.frp.PersistentDeviceOwnerState;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* renamed from: glh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class glh {

    /* renamed from: a */
    public static final Logger f18461a = ght.m13171a("FactoryResetProtectionManager");

    /* renamed from: e */
    private static WeakReference f18462e = new WeakReference(null);

    /* renamed from: b */
    public final Context f18463b;

    /* renamed from: c */
    public final glj f18464c;

    /* renamed from: d */
    public final Object f18465d = new Object();

    /* renamed from: f */
    private final int f18466f;

    /* renamed from: g */
    private final Random f18467g;

    /* renamed from: h */
    private final boolean f18468h;

    private glh(Context context, int i, glj glj) {
        boolean h = soz.m35811h(context);
        SecureRandom secureRandom = new SecureRandom();
        sdo.m34959a(context);
        this.f18463b = context;
        this.f18466f = i;
        this.f18464c = glj;
        sdo.m34959a(secureRandom);
        this.f18467g = secureRandom;
        this.f18468h = h;
    }

    /* renamed from: a */
    public static synchronized glh m13369a(Context context) {
        synchronized (glh.class) {
            glh glh = (glh) f18462e.get();
            if (glh != null) {
                cbyu.m128929c();
                return glh;
            }
            glh glh2 = new glh(context, context.getApplicationInfo().uid, glk.m13386a(context));
            f18462e = new WeakReference(glh2);
            return glh2;
        }
    }

    /* renamed from: c */
    private static final boolean m13372c(String str) {
        if (str.matches("[0-9]+")) {
            return true;
        }
        Logger Logger = f18461a;
        String valueOf = String.valueOf(str);
        Logger.mo25416d(valueOf.length() == 0 ? new String("factoryResetProtectionAdmin app restriction contains unsupported value: ") : "factoryResetProtectionAdmin app restriction contains unsupported value: ".concat(valueOf), new Object[0]);
        return false;
    }

    /* renamed from: b */
    public final FrpSnapshot mo12010b() {
        boolean z;
        if (!mo12009a()) {
            f18461a.mo25416d("Factory reset protection is not supported!", new Object[0]);
            return FrpSnapshot.m6645a();
        } else if (!gnv.m13506P()) {
            f18461a.mo25416d("Factory reset protection is disabled by GservicesFlag!", new Object[0]);
            return FrpSnapshot.m6645a();
        } else {
            synchronized (this.f18465d) {
                imc b = this.f18464c.mo12018b();
                if (b == null) {
                    f18461a.mo25416d("DataBlockContainer is null.", new Object[0]);
                    FrpSnapshot b2 = FrpSnapshot.m6646b();
                    return b2;
                }
                if (mo12012c()) {
                    if ((b.f21343a & 1) != 0) {
                        if (Settings.Global.getInt(this.f18463b.getContentResolver(), "device_provisioned", 0) == 0) {
                            if (!mo12013d()) {
                                PersistentDeviceOwnerState f = mo12015f();
                                if (!mo12009a()) {
                                    f18461a.mo25416d("Factory reset protection is not supported!", new Object[0]);
                                    z = false;
                                } else if (!gnv.m13506P()) {
                                    f18461a.mo25416d("Factory reset protection is disabled by GservicesFlag!", new Object[0]);
                                    z = false;
                                } else {
                                    synchronized (this.f18465d) {
                                        imc b3 = this.f18464c.mo12018b();
                                        if (b3 != null) {
                                            Iterator it = b3.f21344b.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    if (((C1082ime) it.next()).f21357e.size() > 0) {
                                                        f18461a.mo25414c("Factory Reset Protection challenge found!", new Object[0]);
                                                        z = true;
                                                        break;
                                                    }
                                                } else {
                                                    z = false;
                                                    break;
                                                }
                                            }
                                        } else {
                                            z = false;
                                        }
                                    }
                                }
                                FrpSnapshot frpSnapshot = new FrpSnapshot(1, true, true, false, f, z);
                                return frpSnapshot;
                            }
                        }
                        FrpSnapshot b4 = FrpSnapshot.m6646b();
                        return b4;
                    }
                }
                if (b.f21344b.size() <= 0) {
                    f18461a.mo25416d("DataBlockContainer doesn't contain any ProfileBlocks.", new Object[0]);
                    FrpSnapshot b5 = FrpSnapshot.m6646b();
                    return b5;
                }
                for (C1082ime ime : b.f21344b) {
                    if (ime.f21357e.size() > 0) {
                        f18461a.mo25414c("Factory Reset Protection challenge found!", new Object[0]);
                        gll.m13392b(this.f18463b);
                        if (!ime.f21358f) {
                            FrpSnapshot frpSnapshot2 = new FrpSnapshot(true, true, false);
                            return frpSnapshot2;
                        }
                        FrpSnapshot frpSnapshot3 = new FrpSnapshot(true, true, true);
                        return frpSnapshot3;
                    }
                }
                f18461a.mo25416d("Searched through %s profiles, no FRP challenges found.", Integer.valueOf(b.f21344b.size()));
                FrpSnapshot b6 = FrpSnapshot.m6646b();
                return b6;
            }
        }
    }

    /* renamed from: d */
    public final boolean mo12013d() {
        return new rtj(this.f18463b, "frp_preferences_storage", true, true).getBoolean("persistent_device_owner_restored", false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        return null;
     */
    /* renamed from: f */
    public final PersistentDeviceOwnerState mo12015f() {
        if (!mo12012c()) {
            return null;
        }
        synchronized (this.f18465d) {
            imc b = this.f18464c.mo12018b();
            if (b != null && (b.f21343a & 1) != 0) {
                imd imd = b.f21345c;
                if (imd == null) {
                    imd = imd.f21346d;
                }
                ComponentName unflattenFromString = ComponentName.unflattenFromString(imd.f21349b);
                imd imd2 = b.f21345c;
                if (imd2 == null) {
                    imd2 = imd.f21346d;
                }
                PersistentDeviceOwnerState persistentDeviceOwnerState = new PersistentDeviceOwnerState(unflattenFromString, imd2.f21350c);
                return persistentDeviceOwnerState;
            }
        }
    }

    /* renamed from: e */
    public final List mo12014e() {
        int i = Build.VERSION.SDK_INT;
        Bundle applicationRestrictions = ((UserManager) this.f18463b.getSystemService("user")).getApplicationRestrictions(this.f18463b.getPackageName());
        List list = null;
        if (applicationRestrictions == null) {
            return null;
        }
        try {
            if (applicationRestrictions.getBoolean("disableFactoryResetProtectionAdmin", false)) {
                return Collections.emptyList();
            }
            Object obj = applicationRestrictions.get("factoryResetProtectionAdmin");
            if (obj instanceof String[]) {
                List<String> asList = Arrays.asList((String[]) obj);
                for (String str : asList) {
                    if (!m13372c(str)) {
                        return null;
                    }
                }
                if (asList.isEmpty()) {
                    return null;
                }
                return asList;
            }
            if (obj instanceof String) {
                String str2 = (String) obj;
                if (m13372c(str2)) {
                    list = Collections.singletonList(str2);
                }
            }
            return list;
        } catch (Exception e) {
            f18461a.mo25417e("Failed to read application restriction.", e, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static final boolean m13370a(C1082ime ime, String str) {
        if (ime.f21357e.size() == 0) {
            f18461a.mo25418e("Invalid ProfileBlock.", new Object[0]);
            return false;
        } else if ((ime.f21353a & 4) == 0 || ime.f21356d.mo73744a() != ime.f21357e.size() * ime.f21355c) {
            f18461a.mo25418e("Invalid SALT.", new Object[0]);
            return false;
        } else {
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                byte[] a = m13371a(str);
                int size = ime.f21357e.size();
                for (int i = 0; i < size; i++) {
                    instance.reset();
                    byte[] k = ime.f21356d.getKey();
                    int i2 = ime.f21355c;
                    instance.update(k, i * i2, i2);
                    instance.update(a);
                    if (Arrays.equals(((ByteString) ime.f21357e.get(i)).getKey(), instance.digest())) {
                        f18461a.mo25414c(String.format("Check successful for account: %s!", str), new Object[0]);
                        return true;
                    }
                }
                f18461a.mo25416d("Check failed! Account %s was not among the %s accounts on the profile.", str, Integer.valueOf(size));
            } catch (NoSuchAlgorithmException e) {
                f18461a.mo25417e("Error when checking account presence.", e, new Object[0]);
            }
            f18461a.mo25414c(String.format("Check failed for account: %s.", str), new Object[0]);
            return false;
        }
    }

    /* renamed from: c */
    public final boolean mo12012c() {
        if (mo12009a()) {
            int i = Build.VERSION.SDK_INT;
            if (gnv.m13507Q()) {
                return true;
            }
            f18461a.mo25416d("Persistent device owner state is disabled by GservicesFlag!", new Object[0]);
            return false;
        }
        f18461a.mo25416d("Persistent device owner state is not supported!", new Object[0]);
        return false;
    }

    /* renamed from: a */
    static byte[] m13371a(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    /* renamed from: a */
    public final void mo12007a(imd imd) {
        imc imc;
        sdo.m34975b(imd == null || !TextUtils.isEmpty(imd.f21349b), "device owner's component name cannot be empty");
        Logger Logger = f18461a;
        String valueOf = String.valueOf(imd);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
        sb.append("Updating data block with persistent device owner state ");
        sb.append(valueOf);
        Logger.mo25414c(sb.toString(), new Object[0]);
        if (!mo12012c()) {
            f18461a.mo25414c("Update failed! Persistent device owner state not enabled.", new Object[0]);
            return;
        }
        synchronized (this.f18465d) {
            try {
                imc b = this.f18464c.mo12018b();
                if (b == null || b.f21344b.size() == 0) {
                    if (imd == null) {
                        imc = null;
                        f18461a.mo25414c(String.format("Write complete, result: %d.", Long.valueOf(this.f18464c.mo12016a(imc))), new Object[0]);
                    }
                }
                if (b == null) {
                    b = imc.f21341d;
                }
                if (imd != null) {
                    bxvd bxvd = (bxvd) b.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) b);
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    imc imc2 = (imc) bxvd.f164949b;
                    imc imc3 = imc.f21341d;
                    imd.getClass();
                    imc2.f21345c = imd;
                    imc2.f21343a |= 1;
                    imc = (imc) bxvd.mo74062i();
                } else {
                    f18461a.mo25416d("DeviceOwnerBlock is null", new Object[0]);
                    imc = b;
                }
                f18461a.mo25414c(String.format("Write complete, result: %d.", Long.valueOf(this.f18464c.mo12016a(imc))), new Object[0]);
            } catch (IOException e) {
                f18461a.mo25417e("Update failed!", e, new Object[0]);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final String mo12011b(String str) {
        try {
            return gik.m13218f(this.f18463b, str);
        } catch (gid | IOException e) {
            f18461a.mo25417e("Cannot get accountId.", e, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo12008a(List list, boolean z) {
        int i;
        boolean z2;
        boolean z3 = !gnv.m13508R() ? false : z;
        Logger Logger = f18461a;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        StringBuilder sb = new StringBuilder(77);
        sb.append("Updating data block with ");
        sb.append(i);
        sb.append(" account ids. Lockscreen supported? ");
        sb.append(z3);
        Logger.mo25414c(sb.toString(), new Object[0]);
        if (!mo12009a()) {
            f18461a.mo25414c("Update failed! FactoryResetProtection is unsupported.", new Object[0]);
            return;
        }
        synchronized (this.f18465d) {
            try {
                imc b = this.f18464c.mo12018b();
                imc imc = null;
                if (list != null && !list.isEmpty()) {
                    if (b == null) {
                        b = imc.f21341d;
                    }
                    MessageDigest instance = MessageDigest.getInstance("SHA-256");
                    ArrayList arrayList = new ArrayList(list);
                    int size = arrayList.size();
                    byte[] bArr = new byte[(size * 32)];
                    this.f18467g.nextBytes(bArr);
                    bxvd da = C1082ime.f21351g.mo74144da();
                    int i2 = this.f18466f;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    C1082ime ime = (C1082ime) da.f164949b;
                    int i3 = ime.f21353a | 1;
                    ime.f21353a = i3;
                    ime.f21354b = i2;
                    ime.f21353a = i3 | 2;
                    ime.f21355c = 32;
                    ByteString a = ByteString.m123261a(bArr);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    C1082ime ime2 = (C1082ime) da.f164949b;
                    a.getClass();
                    ime2.f21353a |= 4;
                    ime2.f21356d = a;
                    for (int i4 = 0; i4 < size; i4++) {
                        instance.reset();
                        instance.update(((C1082ime) da.f164949b).f21356d.getKey(), i4 * 32, 32);
                        instance.update(m13371a((String) arrayList.get(i4)));
                        ByteString a2 = ByteString.m123261a(instance.digest());
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        C1082ime ime3 = (C1082ime) da.f164949b;
                        a2.getClass();
                        if (!ime3.f21357e.mo73666a()) {
                            ime3.f21357e = GeneratedMessageLite.m124021a(ime3.f21357e);
                        }
                        ime3.f21357e.add(a2);
                    }
                    C1082ime ime4 = (C1082ime) da.mo74062i();
                    bxvd bxvd = (bxvd) ime4.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) ime4);
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    C1082ime ime5 = (C1082ime) bxvd.f164949b;
                    ime5.f21353a |= 8;
                    ime5.f21358f = z3;
                    C1082ime ime6 = (C1082ime) bxvd.mo74062i();
                    if (b.f21344b.size() == 0) {
                        bxvd bxvd2 = (bxvd) b.mo74142c(5);
                        bxvd2.mo73625a((GeneratedMessageLite) b);
                        bxvd2.mo74002a(ime6);
                        imc = (imc) bxvd2.mo74062i();
                    } else {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= b.f21344b.size()) {
                                imc = b;
                                z2 = false;
                                break;
                            } else if (((C1082ime) b.f21344b.get(i5)).f21354b == this.f18466f) {
                                bxvd bxvd3 = (bxvd) b.mo74142c(5);
                                bxvd3.mo73625a((GeneratedMessageLite) b);
                                if (bxvd3.f164950c) {
                                    bxvd3.mo74035c();
                                    bxvd3.f164950c = false;
                                }
                                imc imc2 = (imc) bxvd3.f164949b;
                                ime6.getClass();
                                imc2.mo13136a();
                                imc2.f21344b.set(i5, ime6);
                                imc = (imc) bxvd3.mo74062i();
                                z2 = true;
                            } else {
                                i5++;
                            }
                        }
                        if (!z2) {
                            bxvd bxvd4 = (bxvd) imc.mo74142c(5);
                            bxvd4.mo73625a((GeneratedMessageLite) imc);
                            bxvd4.mo74002a(ime6);
                            imc = (imc) bxvd4.mo74062i();
                        }
                    }
                } else if (!(b == null || (b.f21343a & 1) == 0)) {
                    bxvd bxvd5 = (bxvd) b.mo74142c(5);
                    bxvd5.mo73625a((GeneratedMessageLite) b);
                    if (bxvd5.f164950c) {
                        bxvd5.mo74035c();
                        bxvd5.f164950c = false;
                    }
                    ((imc) bxvd5.f164949b).f21344b = GeneratedMessageLite.m124030de();
                    imc = (imc) bxvd5.mo74062i();
                }
                f18461a.mo25414c(String.format("Write complete, result: %d.", Long.valueOf(this.f18464c.mo12016a(imc))), new Object[0]);
            } catch (NoSuchAlgorithmException e) {
                e = e;
                f18461a.mo25417e("Update failed!", e, new Object[0]);
            } catch (IOException e2) {
                e = e2;
                f18461a.mo25417e("Update failed!", e, new Object[0]);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo12009a() {
        return this.f18464c.mo12017a() && this.f18468h && gnv.m13505O();
    }
}
