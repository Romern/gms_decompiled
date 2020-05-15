package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.model.posts.Post;
import com.google.android.gms.plus.service.v1whitelisted.models.AclEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aobm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aobm extends aoba {

    /* renamed from: a */
    private final ClientContext f78094a;

    /* renamed from: b */
    private final antn f78095b;

    /* renamed from: c */
    private final Post f78096c;

    public aobm(ClientContext clientContext, antn antn, Post post) {
        this.f78094a = clientContext;
        this.f78095b = antn;
        this.f78096c = post;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0138 A[Catch:{ UserRecoverableAuthException -> 0x01b5, gid -> 0x01a8, VolleyError -> 0x0197 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x013c A[Catch:{ UserRecoverableAuthException -> 0x01b5, gid -> 0x01a8, VolleyError -> 0x0197 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x015a A[Catch:{ UserRecoverableAuthException -> 0x01b5, gid -> 0x01a8, VolleyError -> 0x0197 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0190 A[Catch:{ UserRecoverableAuthException -> 0x01b5, gid -> 0x01a8, VolleyError -> 0x0197 }] */
    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        ArrayList arrayList;
        String str;
        String str2;
        ActivityEntity a;
        Post post;
        Context context2 = context;
        try {
            aofb aofb = new aofb();
            if (this.f78096c.mo46616b()) {
                aofb.f78284a = this.f78096c.f82555e;
                aofb.f78285b.add(4);
            }
            Post post2 = this.f78096c;
            aoex aoex = new aoex();
            Bundle bundle = post2.f82559i;
            boolean z = true;
            if (bundle == null || bundle.isEmpty()) {
                z = false;
            } else {
                aona a2 = aona.m66118a(post2.f82559i);
                if (a2.mo43070b()) {
                    aoex.mo42650a(a2.mo43069a());
                }
                if (a2.mo43076h()) {
                    aoex.f78275d = a2.mo43075g();
                    aoex.f78278g.add(6);
                }
                if (a2.mo43078j()) {
                    aoex.f78273b = a2.mo43077i();
                    aoex.f78278g.add(4);
                }
                if (a2.mo43080l()) {
                    aoez aoez = new aoez();
                    aoez.f78282a = a2.mo43079k();
                    aoez.f78283b.add(4);
                    aoex.f78276e = new ActivityEntity.ObjectEntity.AttachmentsEntity.ImageEntity(aoez.f78283b, aoez.f78282a);
                    aoex.f78278g.add(10);
                }
                if (a2.mo43072d()) {
                    aoey aoey = new aoey();
                    aoey.f78280a = a2.mo43071c();
                    aoey.f78281b.add(2);
                    aoex.f78274c = new ActivityEntity.ObjectEntity.AttachmentsEntity.DeepLinkEntity(aoey.f78281b, aoey.f78280a);
                    aoex.f78278g.add(5);
                }
            }
            if (post2.mo46617c()) {
                aomz.m66116a(post2.f82558h).mo43068a(aoex);
            } else if (!z) {
                arrayList = null;
                aofb.mo42652a(arrayList);
                aoeu aoeu = new aoeu();
                aoeu.mo42648a(aofb.mo42651a());
                aoeu.f78263a = (AclEntity) anxi.m65489a(this.f78096c.f82562l);
                aoeu.f78264b.add(2);
                ClientContext clientContext = this.f78094a;
                Post post3 = this.f78096c;
                str = post3.f82561k;
                String str3 = post3.f82560j;
                boolean d = post3.mo46618d();
                String str4 = this.f78096c.f82556f;
                aofd a3 = aoeu.mo42647a();
                ansg ansg = anru.f77552c;
                if (!TextUtils.isEmpty(str)) {
                    str2 = "me";
                } else {
                    str2 = str;
                }
                a = ansg.f77578b.mo42553a(clientContext, str2, str3, anxj.m65495a(context), false, false, Boolean.valueOf(d), str4, (ActivityEntity) a3);
                if (a == null) {
                    String str5 = a.f82761e;
                    List list = this.f78096c.f82553c;
                    Uri parse = Uri.parse(a.f82766j);
                    Post post4 = this.f78096c;
                    String str6 = post4.f82555e;
                    String str7 = post4.f82556f;
                    String str8 = post4.f82557g;
                    Bundle bundle2 = post4.f82558h;
                    Bundle bundle3 = post4.f82559i;
                    String str9 = post4.f82560j;
                    Boolean valueOf = Boolean.valueOf(post4.mo46618d());
                    Post post5 = this.f78096c;
                    post = new Post(str5, list, parse, str6, str7, str8, bundle2, bundle3, str9, valueOf, post5.f82561k, post5.f82562l);
                } else {
                    post = null;
                }
                this.f78095b.mo42242a(0, (Bundle) null, post);
            }
            arrayList = new ArrayList();
            arrayList.add(aoex.mo42649a());
            aofb.mo42652a(arrayList);
            aoeu aoeu2 = new aoeu();
            aoeu2.mo42648a(aofb.mo42651a());
            aoeu2.f78263a = (AclEntity) anxi.m65489a(this.f78096c.f82562l);
            aoeu2.f78264b.add(2);
            ClientContext clientContext2 = this.f78094a;
            Post post32 = this.f78096c;
            str = post32.f82561k;
            String str32 = post32.f82560j;
            boolean d2 = post32.mo46618d();
            String str42 = this.f78096c.f82556f;
            aofd a32 = aoeu2.mo42647a();
            ansg ansg2 = anru.f77552c;
            if (!TextUtils.isEmpty(str)) {
            }
            a = ansg2.f77578b.mo42553a(clientContext2, str2, str32, anxj.m65495a(context), false, false, Boolean.valueOf(d2), str42, (ActivityEntity) a32);
            if (a == null) {
            }
            this.f78095b.mo42242a(0, (Bundle) null, post);
        } catch (UserRecoverableAuthException e) {
            Bundle bundle4 = new Bundle();
            bundle4.putParcelable("pendingIntent", PendingIntent.getActivity(context2, 0, e.mo7366a(), 0));
            this.f78095b.mo42242a(4, bundle4, (Post) null);
        } catch (gid e2) {
            this.f78095b.mo42242a(4, anuj.m65341a(context2, this.f78094a), (Post) null);
        } catch (VolleyError e3) {
            Log.e("InsertActivityOperation", e3.getMessage(), e3);
            this.f78095b.mo42242a(7, (Bundle) null, (Post) null);
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        antn antn = this.f78095b;
        if (antn != null) {
            antn.mo42242a(8, (Bundle) null, (Post) null);
        }
    }
}
