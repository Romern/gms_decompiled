package p000;

import android.content.Context;
import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.response.FieldMappingDictionary;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import java.util.List;

/* renamed from: aobi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aobi extends aoba {

    /* renamed from: a */
    private final ClientContext f78083a;

    /* renamed from: b */
    private final antk f78084b;

    /* renamed from: c */
    private final List f78085c;

    public aobi(ClientContext clientContext, List list, antk antk) {
        this.f78083a = clientContext;
        this.f78085c = list;
        this.f78084b = antk;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0070, code lost:
        r1.f78084b.mo42235a(com.google.android.gms.common.data.DataHolder.m22539b(7), (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0079, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0086, code lost:
        r1.f78084b.mo42235a(com.google.android.gms.common.data.DataHolder.m22536a(4, p000.anuj.m65341a(r2, r1.f78083a)), (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0096, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0097, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0098, code lost:
        r3 = new android.os.Bundle();
        r3.putParcelable("pendingIntent", android.app.PendingIntent.getActivity(r2, 0, r0.mo7366a(), 0));
        r1.f78084b.mo42235a(com.google.android.gms.common.data.DataHolder.m22536a(4, r3), (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b4, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006f A[ExcHandler: InterruptedException (e java.lang.InterruptedException), Splitter:B:1:0x0007] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0085 A[ExcHandler: gid (e gid), Splitter:B:1:0x0007] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0097 A[ExcHandler: UserRecoverableAuthException (r0v0 'e' com.google.android.gms.auth.UserRecoverableAuthException A[CUSTOM_DECLARE]), Splitter:B:1:0x0007] */
    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        Context context2 = context;
        try {
            ClientContext clientContext = this.f78083a;
            List list = this.f78085c;
            anse anse = anru.f77553d;
            rtu d = rts.m34440d();
            ansd ansd = new ansd(d);
            FieldMappingDictionary a = SafeParcelResponse.m22678a(PersonEntity.class);
            anse.f77575b.mo25545d();
            int i = 0;
            while (i < list.size()) {
                aodg aodg = anse.f77574a;
                aodg.f78218a.mo25541a(clientContext, aodg.m65827b((String) list.get(i)), SafeParcelResponse.class, a, ansd, ansd);
                i++;
                d = d;
                ansd = ansd;
            }
            anse.f77575b.mo25546e();
            ansd.mo25940c();
            Bundle bundle = new Bundle();
            bundle.putBoolean("com.google.android.gms.plus.IsSafeParcelable", true);
            this.f78084b.mo42235a(d.mo25164a(0, bundle), (String) null);
        } catch (VolleyError e) {
            throw e;
        } catch (UserRecoverableAuthException e2) {
        } catch (gid e3) {
        } catch (InterruptedException e4) {
        } catch (VolleyError e5) {
            this.f78084b.mo42235a(DataHolder.m22539b(7), (String) null);
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        antk antk = this.f78084b;
        if (antk != null) {
            antk.mo42232a(8, (Bundle) null, (SafeParcelResponse) null);
        }
    }
}
