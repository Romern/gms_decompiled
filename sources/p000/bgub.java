package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.location.places.personalized.UserPlace;
import com.google.android.gms.location.places.personalized.UserPlacesResult;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bgub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgub {

    /* renamed from: a */
    private final Context f117546a;

    public bgub(Context context) {
        new HashSet();
        new HashSet();
        this.f117546a = context;
    }

    /* renamed from: a */
    public final String[] mo63173a(Account account) {
        List list;
        aemh aemh = new aemh();
        aemh.f63518d = account.name;
        rkb rkb = aema.m52142b(this.f117546a, aemh.mo34328a()).f43165D;
        aepa aepa = new aepa(aema.f63501a, rkb);
        rkb.mo24787a((rle) aepa);
        aucb a = sdl.m34955a(aepa, new rkj());
        try {
            aucu.m76783a(a, chcs.f188354a.mo6606a().mo85045aG(), TimeUnit.MILLISECONDS);
            List<UserPlace> list2 = ((UserPlacesResult) ((rkj) a.mo50386d()).f43190a).f79591b;
            if (list2 == null || list2.isEmpty()) {
                return null;
            }
            String[] strArr = new String[2];
            for (UserPlace userPlace : list2) {
                String str = userPlace.f79588a;
                if (!(str == null || (list = userPlace.f79589b) == null || list.isEmpty())) {
                    if (list.contains(1)) {
                        strArr[0] = str;
                    }
                    if (list.contains(2)) {
                        strArr[1] = str;
                    }
                }
            }
            if (strArr[0] == null && strArr[1] == null) {
                return null;
            }
            return strArr;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Exception on getUserPlaces:");
            sb.append(valueOf);
            bgur.m100025c("GCoreUlr", sb.toString());
            return null;
        }
    }
}
