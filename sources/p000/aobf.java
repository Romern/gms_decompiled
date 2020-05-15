package p000;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.plus.internal.model.apps.AppAclsEntity;
import com.google.android.gms.plus.internal.model.apps.ApplicationEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.AclEntity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aobf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aobf extends aoba {

    /* renamed from: a */
    private final ClientContext f78069a;

    /* renamed from: b */
    private final String f78070b;

    /* renamed from: c */
    private final antn f78071c;

    /* renamed from: d */
    private final ApplicationEntity f78072d;

    public aobf(ClientContext clientContext, String str, antn antn, ApplicationEntity applicationEntity) {
        this.f78069a = clientContext;
        this.f78070b = str;
        this.f78071c = antn;
        this.f78072d = applicationEntity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0119, code lost:
        r1.f78071c.mo42248a(7, null, r1.f78070b, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0122, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0124, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0134, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0135, code lost:
        r3 = new android.os.Bundle();
        r3.putParcelable("pendingIntent", android.app.PendingIntent.getActivity(r2, 0, r0.mo7366a(), 0));
        r1.f78071c.mo42248a(4, r3, r1.f78070b, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0151, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0118 A[ExcHandler: VolleyError (e com.android.volley.VolleyError), Splitter:B:10:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0134 A[ExcHandler: UserRecoverableAuthException (r0v0 'e' com.google.android.gms.auth.UserRecoverableAuthException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        String str;
        boolean z;
        boolean z2;
        char c;
        Context context2 = context;
        try {
            ClientContext clientContext = this.f78069a;
            String str2 = this.f78070b;
            ApplicationEntity applicationEntity = this.f78072d;
            ansg ansg = anru.f77552c;
            ansg.f77585i.mo25545d();
            String a = anxj.m65495a(context);
            spp a2 = spp.m35906a();
            spp b = a2.mo25939b();
            spp spp = b;
            ansg.f77577a.mo42551a(clientContext, str2, "shared", a, b, b);
            spp b2 = a2.mo25939b();
            clientContext.mo17809e();
            if (!applicationEntity.f82388j) {
                str = "visible";
            } else {
                str = "connected";
            }
            spp spp2 = b2;
            ansg.f77577a.mo42551a(clientContext, str2, str, a, b2, b2);
            try {
                ansg.f77585i.mo25546e();
            } catch (InterruptedException e) {
            }
            a2.mo25940c();
            if (!spp.mo25941d() || !spp2.mo25941d()) {
                throw new VolleyError("Interrupted.");
            }
            AclEntity aclEntity = (AclEntity) spp.mo25937a(0);
            Audience b3 = anxi.m65494b(aclEntity);
            AclEntity aclEntity2 = (AclEntity) spp2.mo25937a(0);
            boolean z3 = aclEntity2.f82743j;
            boolean z4 = aclEntity2.f82744k;
            int a3 = ankp.m64683a(aclEntity2.f82745l);
            String str3 = aclEntity2.f82737d;
            String str4 = aclEntity2.f82736c;
            if (aclEntity2.mo42632f()) {
                List list = aclEntity2.f82740g;
                int i = 0;
                z = false;
                boolean z5 = false;
                while (i < list.size()) {
                    String d = ((aoib) list.get(i)).mo42790d();
                    int hashCode = d.hashCode();
                    List list2 = list;
                    if (hashCode != -2120936254) {
                        if (hashCode == -393605868 && d.equals("allContacts")) {
                            c = 1;
                            if (c == 0) {
                                z5 = true;
                            } else if (c == 1) {
                                z = true;
                            }
                            i++;
                            list = list2;
                        }
                    } else if (d.equals("allCircles")) {
                        c = 0;
                        if (c == 0) {
                        }
                        i++;
                        list = list2;
                    }
                    c = 65535;
                    if (c == 0) {
                    }
                    i++;
                    list = list2;
                }
                z2 = z5;
            } else {
                z2 = false;
                z = false;
            }
            ArrayList arrayList = z2 ? new ArrayList() : anxi.m65491a(aclEntity2);
            anwr anwr = new anwr();
            anwr.f77839i = str3;
            anwr.f77840j = str4;
            anwr.f77832b = b3;
            anwr.f77833c = arrayList;
            anwr.f77834d = z2;
            anwr.f77835e = z;
            anwr.f77836f = z3;
            anwr.f77837g = z4;
            anwr.f77838h = a3;
            anwr.f77831a = aclEntity.f82737d;
            this.f78071c.mo42248a(0, null, this.f78070b, anwr.mo42346a());
        } catch (UserRecoverableAuthException e2) {
        } catch (gid e3) {
            AppAclsEntity appAclsEntity = null;
            this.f78071c.mo42248a(4, anuj.m65341a(context2, this.f78069a), this.f78070b, appAclsEntity);
        } catch (VolleyError e4) {
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        antn antn = this.f78071c;
        if (antn != null) {
            antn.mo42248a(8, null, this.f78070b, null);
        }
    }
}
