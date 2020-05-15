package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.gms.mdd.FileGroupResponse;
import com.google.android.gms.mdd.MddFile;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: absi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class absi {

    /* renamed from: a */
    private final Context f58103a;

    /* renamed from: b */
    private final abym f58104b;

    public absi(Context context, abym abym) {
        this.f58103a = context;
        this.f58104b = abym;
    }

    /* renamed from: a */
    private final boolean m48215a(String str, SharedPreferences sharedPreferences, FileGroupResponse fileGroupResponse) {
        absg.m48186a("%s Writing new client file group for %s", "MDDHelper", str);
        abym abym = this.f58104b;
        long d = (long) ((int) cenp.f183105a.mo6606a().mo79456d());
        if (abym.mo32452a(d)) {
            bxvd da = bpwz.f139594g.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpwz bpwz = (bpwz) da.f164949b;
            str.getClass();
            bpwz.f139596a |= 1;
            bpwz.f139597b = str;
            bxvd da2 = bpxb.f139606R.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpxb bpxb = (bpxb) da2.f164949b;
            bpwz bpwz2 = (bpwz) da.mo74062i();
            bpwz2.getClass();
            bpxb.f139634j = bpwz2;
            bpxb.f139625a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            abym.mo32438a(1035, da2, d);
        }
        bxvd da3 = abpm.f57871d.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        abpm abpm = (abpm) da3.f164949b;
        str.getClass();
        abpm.f57873a |= 1;
        abpm.f57874b = str;
        for (int i = 0; i < fileGroupResponse.f79963c.size(); i++) {
            MddFile mddFile = (MddFile) fileGroupResponse.f79963c.get(i);
            bxvd da4 = abpl.f57866d.mo74144da();
            String str2 = mddFile.f79969a;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            abpl abpl = (abpl) da4.f164949b;
            str2.getClass();
            int i2 = abpl.f57868a | 1;
            abpl.f57868a = i2;
            abpl.f57869b = str2;
            String str3 = mddFile.f79970b;
            str3.getClass();
            abpl.f57868a = i2 | 2;
            abpl.f57870c = str3;
            da3.mo73972a((abpl) da4.mo74062i());
        }
        return sharedPreferences.edit().putString(str, Base64.encodeToString(((abpm) da3.mo74062i()).mo73642k(), 3)).commit();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final abpm mo32340b(String str) {
        return (abpm) abzw.m48732a(this.f58103a.getSharedPreferences("gms_icing_client_groups_mdd", 0), str, (bxxk) abpm.f57871d.mo74142c(7));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* renamed from: a */
    public final boolean mo32339a(String str) {
        abpl abpl;
        aucb a = afkf.m53198a(this.f58103a).mo34919a(str, "com.google.android.gms");
        try {
            aucu.m76783a(a, 3000, TimeUnit.MILLISECONDS);
            FileGroupResponse fileGroupResponse = (FileGroupResponse) a.mo50386d();
            SharedPreferences sharedPreferences = this.f58103a.getSharedPreferences("gms_icing_client_groups_mdd", 0);
            abpm abpm = (abpm) abzw.m48732a(sharedPreferences, str, (bxxk) abpm.f57871d.mo74142c(7));
            if (abpm == null) {
                if (fileGroupResponse.f79963c.size() != 0) {
                    return m48215a(str, sharedPreferences, fileGroupResponse);
                }
                return false;
            } else if (abpm.f57875c.size() != fileGroupResponse.f79963c.size()) {
                return m48215a(str, sharedPreferences, fileGroupResponse);
            } else {
                for (MddFile mddFile : fileGroupResponse.f79963c) {
                    String str2 = mddFile.f79969a;
                    bxwc bxwc = abpm.f57875c;
                    int size = bxwc.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            abpl = null;
                            break;
                        }
                        abpl = (abpl) bxwc.get(i);
                        i++;
                        if (str2.equals(abpl.f57869b)) {
                            break;
                        }
                    }
                    if (abpl == null || !abpl.f57870c.equals(mddFile.f79970b)) {
                        return m48215a(str, sharedPreferences, fileGroupResponse);
                    }
                    while (r4.hasNext()) {
                    }
                }
                return false;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            absg.m48199c("%s Exception while executing mdd read task for group %s : %s", "MDDHelper", str, e);
            return false;
        }
    }
}
