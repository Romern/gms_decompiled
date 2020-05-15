package p000;

import android.accounts.Account;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.people.service.galprovider.PeopleGalChimeraProvider;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: ampz */
public final /* synthetic */ class ampz implements Callable {

    /* renamed from: a */
    private final PeopleGalChimeraProvider f75713a;

    /* renamed from: b */
    private final int f75714b;

    /* renamed from: c */
    private final String[] f75715c;

    /* renamed from: d */
    private final Account f75716d;

    /* renamed from: e */
    private final String f75717e;

    /* renamed from: f */
    private final String f75718f;

    /* renamed from: g */
    private final long f75719g;

    /* renamed from: h */
    private final boolean f75720h;

    /* renamed from: i */
    private final bxvd f75721i;

    public ampz(PeopleGalChimeraProvider peopleGalChimeraProvider, int i, String[] strArr, Account account, String str, String str2, long j, boolean z, bxvd bxvd) {
        this.f75713a = peopleGalChimeraProvider;
        this.f75714b = i;
        this.f75715c = strArr;
        this.f75716d = account;
        this.f75717e = str;
        this.f75718f = str2;
        this.f75719g = j;
        this.f75720h = z;
        this.f75721i = bxvd;
    }

    public final Object call() {
        String str;
        String str2;
        long j;
        PeopleGalChimeraProvider peopleGalChimeraProvider = this.f75713a;
        int i = this.f75714b;
        String[] strArr = this.f75715c;
        Account account = this.f75716d;
        String str3 = this.f75717e;
        String str4 = this.f75718f;
        long j2 = this.f75719g;
        boolean z = this.f75720h;
        bxvd bxvd = this.f75721i;
        boolean z2 = i == 4;
        boolean z3 = i == 5;
        String str5 = account.name;
        StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 16 + String.valueOf(str3).length());
        sb.append("handleFilter(");
        sb.append(str5);
        sb.append(", ");
        sb.append(str3);
        sb.append(")");
        sb.toString();
        if (str3 == null) {
            str = "PeopleGalProvider";
        } else if (str3.length() < 2) {
            str = "PeopleGalProvider";
        } else {
            if (z3) {
                str2 = "PeopleGalProvider";
                j = cfyo.f186156a.mo6606a().mo83140q() * j2;
            } else {
                str2 = "PeopleGalProvider";
                j = j2;
            }
            String str6 = "Error listAutocompletions grpc response: ";
            long min = Math.min(j, cfyo.f186156a.mo6606a().mo83137n());
            ClientContext a = peopleGalChimeraProvider.mo46472a(account);
            int i2 = (int) min;
            bxvd da = btdm.f148406e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((btdm) da.f164949b).f148409b = 10;
            String decode = Uri.decode(str3);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btdm btdm = (btdm) da.f164949b;
            decode.getClass();
            btdm.f148408a = decode;
            btdm.f148410c = i2;
            bxvd a2 = ampu.m63153a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btcb btcb = (btcb) a2.mo74062i();
            btcb.getClass();
            ((btdm) da.f164949b).f148411d = btcb;
            btdm btdm2 = (btdm) da.mo74062i();
            try {
                ampk ampk = peopleGalChimeraProvider.f82041a.f75685c;
                long millis = TimeUnit.SECONDS.toMillis(cfyo.m143932g());
                if (ampk.f75665b == null) {
                    ampk.f75665b = chtv.m149566a(chtu.UNARY, "google.internal.people.v2.InternalAutocompleteService/ListAutocompletions", ciie.m150370a(btdm.f148406e), ciie.m150370a(btdn.f148412b));
                }
                return ampq.m63149a(strArr, (btdn) ampk.f75666a.mo25553a(ampk.f75665b, a, btdm2, millis, TimeUnit.MILLISECONDS), account.name, str4, j2, z2, z3, z, bxvd);
            } catch (chuw | gid e) {
                Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e);
                throw e;
            } catch (gid e2) {
                String str7 = str2;
                String str8 = str6;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                amlc amlc = (amlc) bxvd.f164949b;
                amlc amlc2 = amlc.f75159h;
                amlc.f75163c = 3;
                amlc.f75161a |= 2;
                String valueOf = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 41);
                sb2.append(str8);
                sb2.append(valueOf);
                Log.e(str7, sb2.toString());
                return null;
            } catch (chuw e3) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                amlc amlc3 = (amlc) bxvd.f164949b;
                amlc amlc4 = amlc.f75159h;
                amlc3.f75163c = 14;
                int i3 = amlc3.f75161a | 2;
                amlc3.f75161a = i3;
                int i4 = e3.f189236a.f189233s.f189211r;
                amlc3.f75161a = i3 | 16;
                amlc3.f75166f = i4;
                String valueOf2 = String.valueOf(e3);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 41);
                sb3.append(str6);
                sb3.append(valueOf2);
                Log.e(str2, sb3.toString());
                return null;
            }
        }
        Log.e(str, "Not enough query characters.");
        return null;
    }
}
