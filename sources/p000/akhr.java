package p000;

import android.accounts.Account;
import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* renamed from: akhr */
final /* synthetic */ class akhr implements Callable {

    /* renamed from: a */
    private final Context f72023a;

    public akhr(Context context) {
        this.f72023a = context;
    }

    public final Object call() {
        Context context = this.f72023a;
        ArrayList arrayList = new ArrayList(akhu.m59727a(context));
        if (!cfov.f185185a.mo6606a().mo82364bl()) {
            try {
                arrayList.removeAll(Arrays.asList(gie.m13193a(context, "com.google", new String[]{aymh.m84252a("usm")})));
            } catch (gid | IOException e) {
                bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("akhu", "d", 394, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to remove unicorn accounts.");
                return new ArrayList();
            }
        }
        if (cfov.m142042R()) {
            return arrayList;
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            Account[] accountArr = (Account[]) adyd.m51363a(context).mo33907a("com.google", new String[]{"service_HOSTED"}).getResult();
            for (Account account : accountArr) {
                if (!cfov.m142042R()) {
                    if (!cfov.f185185a.mo6606a().mo82351bG() || !account.name.endsWith("@google.com")) {
                        arrayList2.add(account);
                    }
                }
            }
            arrayList.removeAll(arrayList2);
            return arrayList;
        } catch (IOException e2) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("akhu", "d", 420, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to remove dasher accounts.");
            return new ArrayList();
        }
    }
}
