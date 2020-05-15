package p000;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.PersonEntity;

/* renamed from: aobk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aobk extends aoba {

    /* renamed from: a */
    private final ClientContext f78089a;

    /* renamed from: b */
    private final antk f78090b;

    /* renamed from: c */
    private final String f78091c;

    public aobk(ClientContext clientContext, String str, antk antk) {
        this.f78089a = clientContext;
        this.f78091c = str;
        this.f78090b = antk;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        r6.f78090b.mo42233a(4, (com.google.android.gms.plus.internal.model.people.PersonEntity) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e A[ExcHandler: gid (e gid), Splitter:B:1:0x0001] */
    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        try {
            ClientContext clientContext = this.f78089a;
            String str = this.f78091c;
            aodp aodp = anru.f77552c.f77582f;
            PersonEntity personEntity = (PersonEntity) aodp.f78226a.mo25536a(clientContext, 0, aodp.m65835a((shc) null, str, (String) null), (Object) null, PersonEntity.class);
            this.f78090b.mo42233a(0, new com.google.android.gms.plus.internal.model.people.PersonEntity(personEntity.f83013c, personEntity.f83016f, new PersonEntity.ImageEntity(personEntity.f83017g.f83032d), personEntity.f83022l));
        } catch (VolleyError e) {
            throw e;
        } catch (gid e2) {
        } catch (VolleyError e3) {
            this.f78090b.mo42233a(7, (com.google.android.gms.plus.internal.model.people.PersonEntity) null);
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        antk antk = this.f78090b;
        if (antk != null) {
            antk.mo42233a(8, (com.google.android.gms.plus.internal.model.people.PersonEntity) null);
        }
    }
}
