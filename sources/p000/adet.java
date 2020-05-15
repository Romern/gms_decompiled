package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: adet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adet implements adeo {

    /* renamed from: a */
    public static final adfs f61519a = new adfs("RouterBackendClient");

    /* renamed from: b */
    public final Context f61520b;

    /* renamed from: c */
    public final adfd f61521c;

    /* renamed from: d */
    public final adfg f61522d;

    /* renamed from: e */
    public final adeu f61523e;

    /* renamed from: f */
    public final ClientContext f61524f;

    /* renamed from: g */
    public final adej f61525g;

    /* renamed from: h */
    private final bqgj f61526h;

    /* renamed from: i */
    private final adfp f61527i;

    /* renamed from: j */
    private final shl f61528j;

    public adet(Context context, adfd adfd, adfg adfg, shl shl, adeu adeu, adej adej, bqgj bqgj, adfp adfp) {
        this.f61520b = context;
        this.f61521c = adfd;
        this.f61522d = adfg;
        this.f61528j = shl;
        this.f61523e = adeu;
        this.f61526h = bqgj;
        this.f61525g = adej;
        this.f61527i = adfp;
        ClientContext clientContext = new ClientContext();
        this.f61524f = clientContext;
        clientContext.f30216f = "com.google.android.gms";
    }

    /* renamed from: a */
    public final bqgg mo33390a(Account account, Collection collection) {
        adey adey = new adey(new adeq(this, collection, account));
        adey.mo33401a(this.f61526h);
        return adey;
    }

    /* renamed from: b */
    public final boolean mo33398b() {
        return adfk.m50305a() == 0 || this.f61527i.mo33420a();
    }

    /* renamed from: c */
    public final void mo33399c() {
        if (ceow.f183163a.mo6606a().mo79500a()) {
            bxvd da = bthw.f148914b.mo74144da();
            String a = cepx.f183246a.mo6606a().mo79574a();
            if (!bmxx.m108577a(a)) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bthw bthw = (bthw) da.f164949b;
                a.getClass();
                if (!bthw.f148916a.mo73666a()) {
                    bthw.f148916a = bxvk.m124021a(bthw.f148916a);
                }
                bthw.f148916a.add(a);
            }
            shl shl = this.f61528j;
            if (shl.f44481c != null) {
                synchronized (shl) {
                    shl.f44481c.mo85656d(chtn.m149536a("x-goog-ext-181495481-bin", chtr.f189133a));
                }
            }
            shl shl2 = this.f61528j;
            byte[] k = ((bthw) da.mo74062i()).mo73642k();
            if (shl2.f44481c == null) {
                synchronized (shl2) {
                    if (shl2.f44481c == null) {
                        shl2.f44481c = new chtr();
                    }
                }
            }
            synchronized (shl2) {
                shl2.f44481c.mo85648a(chtn.m149536a("x-goog-ext-181495481-bin", chtr.f189133a), k);
            }
        }
    }

    /* renamed from: a */
    public final bqgg mo33391a(camj camj, Account account) {
        adey adey = new adey(new ades(this, camj, account));
        adey.mo33401a(this.f61526h);
        return adey;
    }

    /* renamed from: a */
    public final bqgg mo33392a(String str, int i, int i2, List list) {
        adey adey = new adey(new ader(this, list, str, i, i2));
        adey.mo33401a(this.f61526h);
        return adey;
    }

    /* renamed from: a */
    public final bqgg mo33393a(byte[] bArr, Account account, camh camh, Collection collection) {
        adey adey = new adey(new adep(this, bArr, camh, collection, account));
        adey.mo33401a(this.f61526h);
        return adey;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0120  */
    /* renamed from: a */
    public final btio mo33396a(adff adff, List list) {
        String[] strArr;
        String string;
        bxvd da = btio.f148996k.mo74144da();
        Integer num = adff.f61549c;
        if (!(num == null || adff.f61550d == null)) {
            int intValue = num.intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((btio) da.f164949b).f148999b = intValue;
            int intValue2 = adff.f61550d.intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((btio) da.f164949b).f149000c = intValue2;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btio btio = (btio) da.f164949b;
        if (!btio.f149002e.mo73666a()) {
            btio.f149002e = bxvk.m124021a(btio.f149002e);
        }
        bxsy.m123078a(list, btio.f149002e);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btio) da.f164949b).f149003f = true;
        boolean a = cepf.f183179a.mo6606a().mo79513a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btio) da.f164949b).f149001d = a;
        if (cepl.f183185a.mo6606a().mo79531b()) {
            int i = Build.VERSION.SDK_INT;
            if (Build.VERSION.PREVIEW_SDK_INT > 0) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((btio) da.f164949b).f148998a = 10000;
                long a2 = spn.m35843a(this.f61520b);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((btio) da.f164949b).f149004g = a2;
                strArr = adff.f61548b;
                if (strArr != null) {
                    List asList = Arrays.asList(strArr);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    btio btio2 = (btio) da.f164949b;
                    if (!btio2.f149006i.mo73666a()) {
                        btio2.f149006i = bxvk.m124021a(btio2.f149006i);
                    }
                    bxsy.m123078a(asList, btio2.f149006i);
                }
                String str = Build.MODEL;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                str.getClass();
                ((btio) da.f164949b).f149007j = str;
                string = Settings.Secure.getString(this.f61520b.getContentResolver(), "android_id");
                if (string != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    string.getClass();
                    ((btio) da.f164949b).f149005h = string;
                }
                return (btio) da.mo74062i();
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btio) da.f164949b).f148998a = i2;
        long a22 = spn.m35843a(this.f61520b);
        if (da.f164950c) {
        }
        ((btio) da.f164949b).f149004g = a22;
        strArr = adff.f61548b;
        if (strArr != null) {
        }
        String str2 = Build.MODEL;
        if (da.f164950c) {
        }
        str2.getClass();
        ((btio) da.f164949b).f149007j = str2;
        string = Settings.Secure.getString(this.f61520b.getContentResolver(), "android_id");
        if (string != null) {
        }
        return (btio) da.mo74062i();
    }

    /* renamed from: a */
    public final boolean mo33397a() {
        if (cepl.f183185a.mo6606a().mo79553x()) {
            return false;
        }
        if (cepl.f183185a.mo6606a().mo79552w() || adfk.m50305a() == 0 || adfp.m50311a(this.f61527i.f61564a, "usesIntentExtrasForPrelaunchCheck")) {
            return true;
        }
        return false;
    }
}
