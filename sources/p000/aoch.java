package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.internal.model.apps.ApplicationEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.AclEntity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aoch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoch extends aoba {

    /* renamed from: a */
    private final ClientContext f78169a;

    /* renamed from: b */
    private final String f78170b;

    /* renamed from: c */
    private final ApplicationEntity f78171c;

    /* renamed from: d */
    private final List f78172d;

    /* renamed from: e */
    private final boolean f78173e;

    /* renamed from: f */
    private final boolean f78174f;

    /* renamed from: g */
    private final boolean f78175g;

    /* renamed from: h */
    private final boolean f78176h;

    /* renamed from: i */
    private final antn f78177i;

    public aoch(ClientContext clientContext, String str, ApplicationEntity applicationEntity, List list, boolean z, boolean z2, boolean z3, boolean z4, antn antn) {
        this.f78169a = clientContext;
        this.f78170b = str;
        this.f78171c = applicationEntity;
        this.f78172d = list;
        this.f78173e = z;
        this.f78174f = z2;
        this.f78175g = z3;
        this.f78176h = z4;
        this.f78177i = antn;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d5  */
    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        String str;
        boolean z;
        boolean z2;
        char c;
        Context context2 = context;
        try {
            ClientContext clientContext = this.f78169a;
            String str2 = this.f78170b;
            ApplicationEntity applicationEntity = this.f78171c;
            List list = this.f78172d;
            boolean z3 = this.f78173e;
            boolean z4 = this.f78174f;
            boolean z5 = this.f78175g;
            boolean z6 = this.f78176h;
            ansg ansg = anru.f77552c;
            ArrayList arrayList = new ArrayList();
            if (z5) {
                if (z3) {
                    aoia aoia = new aoia();
                    aoia.mo42787b("allCircles");
                    arrayList.add(aoia.mo42785a());
                } else {
                    arrayList.addAll(anxi.m65492a(list));
                }
            }
            aoel aoel = new aoel();
            if (!applicationEntity.f82388j) {
                str = "visible";
            } else {
                str = "connected";
                if (z4 && z6) {
                    aoia aoia2 = new aoia();
                    aoia2.mo42787b("allContacts");
                    arrayList.add(aoia2.mo42785a());
                }
                aoel.f78243a = z5;
                aoel.f78245c.add(10);
                aoel.f78244b = z6;
                aoel.f78245c.add(11);
            }
            aoel.mo42627a(arrayList);
            AclEntity a = ansg.f77577a.mo42549a(clientContext, str2, str, anxj.m65495a(context), (AclEntity) aoel.mo42626a());
            if (a.mo42632f()) {
                List list2 = a.f82740g;
                z2 = false;
                z = false;
                for (int i = 0; i < list2.size(); i++) {
                    String d = ((aoib) list2.get(i)).mo42790d();
                    int hashCode = d.hashCode();
                    if (hashCode != -2120936254) {
                        if (hashCode == -393605868 && d.equals("allContacts")) {
                            c = 1;
                            if (c == 0) {
                                z = true;
                            } else if (c == 1) {
                                z2 = true;
                            }
                        }
                    } else if (d.equals("allCircles")) {
                        c = 0;
                        if (c == 0) {
                        }
                    }
                    c = 65535;
                    if (c == 0) {
                    }
                }
            } else {
                z2 = false;
                z = false;
            }
            ArrayList arrayList2 = z ? new ArrayList() : anxi.m65491a(a);
            anwr anwr = new anwr();
            anwr.f77839i = a.f82737d;
            anwr.f77840j = a.f82736c;
            anwr.f77833c = arrayList2;
            anwr.f77834d = z;
            anwr.f77835e = z2;
            anwr.f77836f = a.f82743j;
            anwr.f77837g = a.f82744k;
            anwr.f77838h = ankp.m64683a(a.f82745l);
            this.f78177i.mo42240a(0, (Bundle) null, anwr.mo42346a());
        } catch (UserRecoverableAuthException e) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context2, 0, e.mo7366a(), 0));
            this.f78177i.mo42237a(4, bundle);
        } catch (gid e2) {
            this.f78177i.mo42237a(4, anuj.m65341a(context2, this.f78169a));
        } catch (VolleyError e3) {
            this.f78177i.mo42237a(7, (Bundle) null);
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        antn antn = this.f78177i;
        if (antn != null) {
            antn.mo42237a(8, (Bundle) null);
        }
    }
}
