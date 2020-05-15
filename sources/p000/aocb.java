package p000;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.plus.model.posts.Post;
import com.google.android.gms.plus.service.v1whitelisted.models.PersonEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.Settings;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

/* renamed from: aocb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aocb extends aoba {

    /* renamed from: a */
    private final ClientContext f78152a;

    /* renamed from: b */
    private final antn f78153b;

    /* renamed from: c */
    private final Post f78154c;

    public aocb(ClientContext clientContext, antn antn, Post post) {
        this.f78152a = clientContext;
        this.f78153b = antn;
        this.f78154c = post;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        android.util.Log.e("PlusWhitelistedAgent", "Network operation interrupted", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x022d, code lost:
        throw new com.android.volley.VolleyError(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x022e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x022f, code lost:
        p000.sil.m35353a(r0, "LoadPostSettingsOp");
        r1.f78153b.mo42243a(7, (android.os.Bundle) null, (com.google.android.gms.plus.model.posts.Settings) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x023b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x023d, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x024b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x024c, code lost:
        r3 = new android.os.Bundle();
        r3.putParcelable("pendingIntent", android.app.PendingIntent.getActivity(r2, 0, r0.mo7366a(), 0));
        r1.f78153b.mo42243a(4, r3, (com.google.android.gms.plus.model.posts.Settings) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0266, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x021e, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0220, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x022e A[ExcHandler: VolleyError (r0v7 'e' com.android.volley.VolleyError A[CUSTOM_DECLARE]), Splitter:B:1:0x0004] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x024b A[ExcHandler: UserRecoverableAuthException (r0v0 'e' com.google.android.gms.auth.UserRecoverableAuthException A[CUSTOM_DECLARE]), Splitter:B:1:0x0004] */
    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        String str;
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        Audience audience;
        Audience audience2;
        Context context2 = context;
        try {
            ClientContext clientContext = this.f78152a;
            Post post = this.f78154c;
            ansg ansg = anru.f77552c;
            spp a = spp.m35906a();
            ansg.f77585i.mo25545d();
            String a2 = anxj.m65495a(context);
            spp b = a.mo25939b();
            String str2 = post.f82561k;
            if (TextUtils.isEmpty(str2)) {
                str = "me";
            } else {
                str = str2;
            }
            aodr aodr = ansg.f77584h;
            String str3 = post.f82560j;
            StringBuilder sb = new StringBuilder();
            new Formatter(sb).format("people/%1$s/settings/%2$s", shd.m35267a(str), shd.m35267a("sharing"));
            if (str3 != null) {
                shd.m35269a(sb, "contextType", shd.m35267a(str3));
            }
            if (a2 != null) {
                shd.m35269a(sb, "language", shd.m35267a(a2));
            }
            String sb2 = sb.toString();
            String str4 = str2;
            aodr.f78228a.mo25540a(clientContext, sb2, Settings.class, b, b);
            spp b2 = a.mo25939b();
            Audience audience3 = post.f82562l;
            if (audience3 != null && audience3.f30287b.size() > 0) {
                int size = audience3.f30287b.size();
                for (int i4 = 0; i4 < size; i4++) {
                    String str5 = ((AudienceMember) audience3.f30287b.get(i4)).f30295e;
                    if (ancm.m64016e(str5) != null) {
                        ansg.f77582f.f78226a.mo25540a(clientContext, aodp.m65835a(ansg.f77576j, ancm.m64016e(str5), str4), PersonEntity.class, b2, b2);
                    }
                }
            }
            ansg.f77585i.mo25546e();
            b.mo25940c();
            boolean booleanValue = ((Boolean) ansx.f77666P.mo25081c()).booleanValue();
            int intValue = ((Integer) ansx.f77667Q.mo25081c()).intValue();
            int intValue2 = ((Integer) ansx.f77668R.mo25081c()).intValue();
            int intValue3 = ((Integer) ansx.f77669S.mo25081c()).intValue();
            if (b.mo25941d()) {
                List list = ((Settings) b.mo25937a(0)).f83063c;
                int size2 = list.size();
                audience = null;
                boolean z3 = false;
                for (int i5 = 0; i5 < size2; i5++) {
                    aoie aoie = (aoie) list.get(i5);
                    if ("sharing.defaultAccess".equals(aoie.mo42799g())) {
                        if (aoie.mo42796c()) {
                            audience = anxi.m65494b(aoie.mo42795b());
                        }
                    }
                    if ("sharing.underageWarning".equals(aoie.mo42799g())) {
                        if (aoie.mo42798f()) {
                            z3 = aoie.mo42797d();
                        }
                    }
                    if ("sharing.showAclPickerFirst".equals(aoie.mo42799g())) {
                        if (aoie.mo42798f()) {
                            booleanValue = aoie.mo42797d();
                        }
                    }
                    if ("sharing.showcasedSuggestionCount".equals(aoie.mo42799g())) {
                        if (aoie.mo42801i()) {
                            intValue = aoie.mo42800h();
                        }
                    }
                    if ("sharing.suggestionCount".equals(aoie.mo42799g())) {
                        if (aoie.mo42801i()) {
                            intValue2 = aoie.mo42800h();
                        }
                    }
                    if ("sharing.clientSuggestionCount".equals(aoie.mo42799g())) {
                        if (aoie.mo42801i()) {
                            intValue3 = aoie.mo42800h();
                        }
                    }
                }
                z = booleanValue;
                i3 = intValue;
                i2 = intValue2;
                i = intValue3;
                z2 = z3;
            } else {
                z = booleanValue;
                i3 = intValue;
                i2 = intValue2;
                i = intValue3;
                audience = null;
                z2 = false;
            }
            ArrayList arrayList = new ArrayList();
            if (b2.mo25941d()) {
                for (int i6 = 0; i6 < b2.f44942a.size(); i6++) {
                    PersonEntity personEntity = (PersonEntity) b2.mo25937a(i6);
                    if (personEntity != null) {
                        arrayList.add(AudienceMember.m22639a(personEntity.f83016f, personEntity.f83013c, null));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                sfd sfd = new sfd();
                sfd.mo25467a(arrayList);
                sfd.mo25466a(audience.f30288c);
                audience2 = sfd.mo25465a();
            } else {
                audience2 = null;
            }
            this.f78153b.mo42243a(0, (Bundle) null, new com.google.android.gms.plus.model.posts.Settings(2, audience, audience2, z2, z, i3, i2, i));
        } catch (UserRecoverableAuthException e) {
        } catch (gid e2) {
            com.google.android.gms.plus.model.posts.Settings settings = null;
            this.f78153b.mo42243a(4, anuj.m65341a(context2, this.f78152a), settings);
        } catch (VolleyError e3) {
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        antn antn = this.f78153b;
        if (antn != null) {
            antn.mo42243a(8, (Bundle) null, (com.google.android.gms.plus.model.posts.Settings) null);
        }
    }
}
