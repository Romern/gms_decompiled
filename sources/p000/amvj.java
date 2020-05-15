package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import java.util.ArrayList;
import java.util.TreeSet;

/* renamed from: amvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amvj {

    /* renamed from: e */
    private static final bngx f76013e = bngx.m109357a((Object) 1, (Object) 3);

    /* renamed from: f */
    private static final bngx f76014f = bngx.m109356a((Object) 4);

    /* renamed from: g */
    private static amvj f76015g;

    /* renamed from: a */
    public final amvi f76016a;

    /* renamed from: b */
    private final amvk f76017b;

    /* renamed from: c */
    private final adyd f76018c;

    /* renamed from: d */
    private final amvl f76019d;

    private amvj(Context context, adyd adyd) {
        amvk a = amvk.m63380a(context);
        amvl amvl = new amvl(context);
        this.f76017b = a;
        this.f76018c = adyd;
        this.f76016a = new amvi(adyd);
        this.f76019d = amvl;
    }

    /* renamed from: a */
    public static synchronized amvj m63368a(Context context) {
        amvj a;
        synchronized (amvj.class) {
            a = m63369a(context, adyd.m51363a(context));
        }
        return a;
    }

    /* renamed from: b */
    private final boolean m63371b(String str) {
        for (Account account : this.f76018c.mo33916a("com.google")) {
            if (str.equals(account.name)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static BackupAndSyncOptInState m63372d() {
        return new BackupAndSyncOptInState(null, new int[0], 1, new String[0]);
    }

    /* renamed from: c */
    public final amsd mo41381c() {
        return this.f76017b.mo41383a();
    }

    /* renamed from: e */
    public final synchronized void mo41382e() {
        amsd c = mo41381c();
        if (c.f75843b && !m63371b(c.f75844c)) {
            mo41379b();
        }
    }

    /* renamed from: a */
    public static synchronized amvj m63369a(Context context, adyd adyd) {
        amvj amvj;
        synchronized (amvj.class) {
            if (f76015g == null) {
                f76015g = new amvj(context, adyd);
            }
            amvj = f76015g;
        }
        return amvj;
    }

    /* renamed from: b */
    public final synchronized void mo41379b() {
        this.f76017b.mo41384a(amsd.f75840f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009f, code lost:
        return;
     */
    /* renamed from: a */
    private final synchronized void m63370a(int[] iArr, int i) {
        amsd a = this.f76017b.mo41383a();
        if (a.f75843b && iArr != null) {
            ArrayList arrayList = new ArrayList();
            for (int i2 : iArr) {
                bngx bngx = f76014f;
                Integer valueOf = Integer.valueOf(i2);
                if (bngx.contains(valueOf)) {
                    arrayList.add(valueOf);
                }
            }
            if (!arrayList.isEmpty()) {
                TreeSet<Integer> treeSet = new TreeSet();
                treeSet.addAll(a.f75845d);
                if (i == 1) {
                    treeSet.addAll(arrayList);
                } else {
                    treeSet.removeAll(arrayList);
                }
                bxvd bxvd = (bxvd) a.mo74142c(5);
                bxvd.mo73625a((bxvk) a);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                amsd amsd = amsd.f75840f;
                ((amsd) bxvd.f164949b).f75845d = bxvk.m124028dc();
                for (Integer num : treeSet) {
                    int intValue = num.intValue();
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    amsd amsd2 = (amsd) bxvd.f164949b;
                    amsd2.mo41297a();
                    amsd2.f75845d.mo74153d(intValue);
                }
                this.f76017b.mo41384a((amsd) bxvd.mo74062i());
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo41380b(int[] iArr) {
        m63370a(iArr, 2);
    }

    /* renamed from: a */
    public final synchronized void mo41376a(String str) {
        bxvd bxvd;
        if (str != null) {
            try {
                if (!m63371b(str)) {
                    throw new aaaj(4, "Account attempting to opt in backup and sync is not signed in.");
                } else if (!cgbt.m144707c() || ((!cfxe.m143371j() && this.f76016a.mo41373a(str)) || (!cfxe.m143372k() && this.f76016a.mo41375b(str)))) {
                    throw new aaaj(5, String.format("Account %s is not eligible for backup and sync.", str));
                } else {
                    if (cfxe.m143367f()) {
                        if (mo41378a()) {
                            throw new aaaj(13, "Contacts count exceeds the system limit.");
                        }
                    }
                    bxvd da = amsc.f75836c.mo74144da();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    amsc amsc = (amsc) da.f164949b;
                    amsc.f75838a |= 1;
                    amsc.f75839b = currentTimeMillis;
                    amsc amsc2 = (amsc) da.mo74062i();
                    amsd a = this.f76017b.mo41383a();
                    if (!a.f75843b) {
                        bxvd = amsd.f75840f.mo74144da();
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        amsd amsd = (amsd) bxvd.f164949b;
                        int i = amsd.f75842a | 1;
                        amsd.f75842a = i;
                        amsd.f75843b = true;
                        str.getClass();
                        amsd.f75842a = i | 2;
                        amsd.f75844c = str;
                        bngx bngx = f76013e;
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        amsd amsd2 = (amsd) bxvd.f164949b;
                        amsd2.mo41297a();
                        bxsy.m123078a(bngx, amsd2.f75845d);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        amsd amsd3 = (amsd) bxvd.f164949b;
                        amsc2.getClass();
                        amsd3.f75846e = amsc2;
                        amsd3.f75842a |= 4;
                    } else {
                        bxvd = (bxvd) a.mo74142c(5);
                        bxvd.mo73625a((bxvk) a);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        amsd amsd4 = (amsd) bxvd.f164949b;
                        amsd amsd5 = amsd.f75840f;
                        str.getClass();
                        int i2 = amsd4.f75842a | 2;
                        amsd4.f75842a = i2;
                        amsd4.f75844c = str;
                        amsc2.getClass();
                        amsd4.f75846e = amsc2;
                        amsd4.f75842a = i2 | 4;
                    }
                    this.f76017b.mo41384a((amsd) bxvd.mo74062i());
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new aaaj(5, "Account name is null.");
        }
    }

    /* renamed from: a */
    public final synchronized void mo41377a(int[] iArr) {
        m63370a(iArr, 1);
    }

    /* renamed from: a */
    public final boolean mo41378a() {
        return ((long) (this.f76019d.mo41388b() + this.f76019d.mo41387a("account_type = \"com.google\""))) > cfxe.f185877a.mo6606a().mo82876R();
    }
}
