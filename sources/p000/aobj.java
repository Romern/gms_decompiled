package p000;

import android.content.Context;
import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.plus.internal.model.people.PersonEntity;

/* renamed from: aobj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aobj extends aoba {

    /* renamed from: a */
    private final ClientContext f78086a;

    /* renamed from: b */
    private final antk f78087b;

    /* renamed from: c */
    private final String f78088c;

    public aobj(ClientContext clientContext, String str, antk antk) {
        this.f78086a = clientContext;
        this.f78088c = str;
        this.f78087b = antk;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r7.f78087b.mo42232a(4, p000.anuj.m65341a(r8, r7.f78086a), (com.google.android.gms.common.server.response.SafeParcelResponse) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        r3 = new android.os.Bundle();
        r3.putParcelable("pendingIntent", android.app.PendingIntent.getActivity(r8, 0, r9.mo7366a(), 0));
        r7.f78087b.mo42232a(4, r3, (com.google.android.gms.common.server.response.SafeParcelResponse) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029 A[ExcHandler: gid (e gid), Splitter:B:1:0x0003] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036 A[ExcHandler: UserRecoverableAuthException (r9v1 'e' com.google.android.gms.auth.UserRecoverableAuthException A[CUSTOM_DECLARE]), Splitter:B:1:0x0003] */
    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        try {
            this.f78087b.mo42232a(0, (Bundle) null, (SafeParcelResponse) anru.f77553d.f77574a.mo42546a(this.f78086a, this.f78088c, SafeParcelResponse.class, SafeParcelResponse.m22678a(PersonEntity.class)));
        } catch (VolleyError e) {
            throw e;
        } catch (UserRecoverableAuthException e2) {
        } catch (gid e3) {
        } catch (VolleyError e4) {
            this.f78087b.mo42232a(7, (Bundle) null, (SafeParcelResponse) null);
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        antk antk = this.f78087b;
        if (antk != null) {
            antk.mo42232a(8, (Bundle) null, (SafeParcelResponse) null);
        }
    }
}
