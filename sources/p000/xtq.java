package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: xtq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xtq implements xto {

    /* renamed from: b */
    public static final Logger f53081b = new Logger(new String[]{"CredentialListCableEidResolver"}, (short[]) null);

    /* renamed from: a */
    public final Set f53082a;

    /* renamed from: c */
    private final Context f53083c;

    /* renamed from: d */
    private final List f53084d;

    public xtq(Context context, List list, Set set) {
        this.f53083c = context;
        this.f53084d = list;
        this.f53082a = set;
    }

    /* renamed from: a */
    public final bqgg mo30127a(byte[] bArr) {
        List list = this.f53084d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            xjm a = xjt.m43060a(bArr, (xjn) list.get(i));
            if (a != null && !this.f53082a.contains(a)) {
                return bqga.m112775a(a);
            }
        }
        try {
            Account[] d = gie.m13199d(this.f53083c, "com.google");
            if (d == null || (r3 = d.length) == 0) {
                f53081b.mo25412b("No accounts signed in", new Object[0]);
                return bqga.m112775a((Object) null);
            }
            ArrayList arrayList = new ArrayList();
            for (Account account : d) {
                arrayList.add(xjt.m43057a(this.f53083c, bArr, account, xka.SOFTWARE_KEY, "fido:android_software_key"));
                if (cdvq.m135121c()) {
                    arrayList.add(xjt.m43057a(this.f53083c, bArr, account, xka.STRONGBOX_KEY, "fido:android_strongbox_key"));
                }
            }
            return bqga.m112782b(arrayList).mo69216a(new xtp(this, arrayList, bArr), bqfb.INSTANCE);
        } catch (RemoteException | rfv | rfw e) {
            f53081b.mo25417e("Error listing Google accounts on device", e, new Object[0]);
            return bqga.m112775a((Object) null);
        }
    }
}
