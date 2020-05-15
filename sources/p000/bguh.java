package p000;

import android.accounts.Account;
import android.util.Pair;
import com.google.android.ulr.ApiMetadata;
import java.util.Collections;
import java.util.List;

/* renamed from: bguh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bguh {

    /* renamed from: a */
    public final bgug f117561a;

    /* renamed from: b */
    public final bgue f117562b;

    public bguh(bgue bgue, bgug bgug) {
        this.f117561a = bgug;
        this.f117562b = bgue;
    }

    /* renamed from: a */
    public final void mo63201a(Account account, Pair pair, String str) {
        boolean z;
        if (chcp.m148195d() && this.f117562b != null) {
            bvwq bvwq = (bvwq) pair.second;
            if (chcp.m148193b() && bvwq != null) {
                bguv.m100042a("UlrApiMetadatasGrpcTriggered");
            } else {
                bvwq = bgzi.m100447a((ApiMetadata) pair.first);
            }
            if (bvwq != null) {
                z = this.f117562b.mo63183a(Collections.singletonList(account), bvwq, str);
            } else {
                z = false;
            }
            StringBuilder sb = new StringBuilder(47);
            sb.append("DatastoreSelector Grpc ApiMetadata put 3: ");
            sb.append(z);
            sb.toString();
            return;
        }
        this.f117561a.mo63196a(Collections.singletonList(account), (ApiMetadata) pair.first, str);
    }

    /* renamed from: a */
    public final boolean mo63202a(List list, Pair pair, String str) {
        if (!chcp.m148195d() || this.f117562b == null) {
            return this.f117561a.mo63196a(list, (ApiMetadata) pair.first, str);
        }
        bvwq bvwq = (bvwq) pair.second;
        if (chcp.m148193b() && bvwq != null) {
            bguv.m100042a("UlrApiMetadatasGrpcTriggered");
        } else {
            bvwq = bgzi.m100447a((ApiMetadata) pair.first);
        }
        if (bvwq != null) {
            return this.f117562b.mo63183a(list, bvwq, str);
        }
        return false;
    }
}
