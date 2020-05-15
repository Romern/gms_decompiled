package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed;
import java.util.Formatter;
import org.whispersystems.curve25519.Curve25519;

/* renamed from: aobs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aobs extends aoba {

    /* renamed from: a */
    private final ClientContext f78123a;

    /* renamed from: b */
    private final antn f78124b;

    /* renamed from: c */
    private final int f78125c;

    /* renamed from: d */
    private final int f78126d;

    /* renamed from: e */
    private final String f78127e;

    public aobs(ClientContext clientContext, int i, int i2, String str, antn antn) {
        this.f78123a = clientContext;
        this.f78125c = i;
        this.f78126d = i2;
        this.f78127e = str;
        this.f78124b = antn;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e8, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00eb, code lost:
        r1.f78124b.mo42245a(7, (android.os.Bundle) null, (com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f4, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f5, code lost:
        r1.f78124b.mo42245a(4, p000.anuj.m65341a(r2, r1.f78123a), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0101, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0102, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0103, code lost:
        r3 = new android.os.Bundle();
        r3.putParcelable("pendingIntent", android.app.PendingIntent.getActivity(r2, 0, r0.mo7366a(), 0));
        r1.f78124b.mo42245a(4, r3, (com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011d, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ea A[ExcHandler: VolleyError (e com.android.volley.VolleyError), Splitter:B:1:0x000c] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f3 A[ExcHandler: gid (e gid), Splitter:B:1:0x000c] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0102 A[ExcHandler: UserRecoverableAuthException (r0v0 'e' com.google.android.gms.auth.UserRecoverableAuthException A[CUSTOM_DECLARE]), Splitter:B:1:0x000c] */
    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        ClientContext clientContext;
        int i;
        String str;
        ansg ansg;
        String str2;
        PeopleFeed peopleFeed;
        String str3;
        ansg ansg2;
        char c;
        ClientContext clientContext2;
        int i2;
        Context context2 = context;
        try {
            clientContext = this.f78123a;
            int i3 = this.f78125c;
            i = this.f78126d;
            str = this.f78127e;
            ansg = anru.f77552c;
            str2 = i3 != 1 ? "alphabetical" : Curve25519.BEST;
            aodp aodp = ansg.f77582f;
            Integer valueOf = Integer.valueOf(i);
            StringBuilder sb = new StringBuilder();
            new Formatter(sb).format("people/%1$s/peopleForSharing", shd.m35267a("me"));
            shd.m35269a(sb, "maxResults", String.valueOf(valueOf));
            shd.m35269a(sb, "orderBy", shd.m35267a(str2));
            if (str != null) {
                shd.m35269a(sb, "pageToken", shd.m35267a(str));
            }
            c = 1;
            ansg2 = ansg;
            str3 = str;
            String sb2 = sb.toString();
            i2 = i;
            clientContext2 = clientContext;
            peopleFeed = (PeopleFeed) aodp.f78226a.mo25536a(clientContext, 1, sb2, (Object) null, PeopleFeed.class);
        } catch (VolleyError e) {
            e = e;
            ansg2 = ansg;
            str3 = str;
            i2 = i;
            clientContext2 = clientContext;
            c = 1;
        } catch (UserRecoverableAuthException e2) {
        } catch (gid e3) {
        }
        this.f78124b.mo42245a(0, (Bundle) null, peopleFeed);
        Log.e("PlusWhitelistedAgent", "listForSharingBlocking VolleyError", e);
        aodp aodp2 = ansg2.f77582f;
        Integer valueOf2 = Integer.valueOf(i2);
        StringBuilder sb3 = new StringBuilder();
        Formatter formatter = new Formatter(sb3);
        Object[] objArr = new Object[2];
        objArr[0] = shd.m35267a("me");
        objArr[c] = shd.m35267a("circled");
        formatter.format("people/%1$s/people/%2$s", objArr);
        shd.m35269a(sb3, "maxResults", String.valueOf(valueOf2));
        shd.m35269a(sb3, "orderBy", shd.m35267a(str2));
        if (str3 != null) {
            shd.m35269a(sb3, "pageToken", shd.m35267a(str3));
        }
        peopleFeed = (PeopleFeed) aodp2.f78226a.mo25536a(clientContext2, 0, sb3.toString(), (Object) null, PeopleFeed.class);
        this.f78124b.mo42245a(0, (Bundle) null, peopleFeed);
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        antn antn = this.f78124b;
        if (antn != null) {
            antn.mo42245a(8, (Bundle) null, (PeopleFeed) null);
        }
    }
}
