package p000;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.model.posts.Comment;
import com.google.android.gms.plus.service.v1whitelisted.models.CommentEntity;
import java.util.Formatter;

/* renamed from: aobn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aobn extends aoba {

    /* renamed from: a */
    private final ClientContext f78097a;

    /* renamed from: b */
    private final antn f78098b;

    /* renamed from: c */
    private final Comment f78099c;

    public aobn(ClientContext clientContext, antn antn, Comment comment) {
        this.f78097a = clientContext;
        this.f78098b = antn;
        this.f78099c = comment;
    }

    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        Comment comment;
        try {
            ClientContext clientContext = this.f78097a;
            Comment comment2 = this.f78099c;
            ansg ansg = anru.f77552c;
            aogs aogs = new aogs();
            if (!TextUtils.isEmpty(comment2.f82544d)) {
                aogs.f78318a = comment2.f82544d;
                aogs.f78319b.add(2);
            }
            aogr aogr = new aogr();
            aogr.f78316a = new CommentEntity.ObjectEntity(aogs.f78319b, aogs.f78318a);
            aogr.f78317b.add(7);
            String str = !TextUtils.isEmpty(comment2.f82546f) ? comment2.f82546f : "me";
            aodn aodn = ansg.f77580d;
            String str2 = comment2.f82543c;
            String str3 = comment2.f82545e;
            CommentEntity commentEntity = new CommentEntity(aogr.f78317b, aogr.f78316a);
            StringBuilder sb = new StringBuilder();
            new Formatter(sb).format("activities/%1$s/comments", shd.m35267a(str2));
            shd.m35269a(sb, "contentFormat", shd.m35267a("html"));
            if (str3 != null) {
                shd.m35269a(sb, "contextType", shd.m35267a(str3));
            }
            if (str != null) {
                shd.m35269a(sb, "onBehalfOf", shd.m35267a(str));
            }
            CommentEntity commentEntity2 = (CommentEntity) aodn.f78224a.mo25536a(clientContext, 1, sb.toString(), commentEntity, CommentEntity.class);
            if (commentEntity2 != null) {
                anxp anxp = new anxp(comment2);
                anxp.f77844b = commentEntity2.f82905d;
                String str4 = anxp.f77844b;
                Comment comment3 = anxp.f77843a;
                comment = new Comment(1, str4, comment3.f82543c, comment3.f82544d, comment3.f82545e, comment3.f82546f);
            } else {
                comment = null;
            }
            this.f78098b.mo42241a(0, (Bundle) null, comment);
        } catch (gid e) {
            this.f78098b.mo42241a(4, anuj.m65341a(context, this.f78097a), (Comment) null);
        } catch (VolleyError e2) {
            Log.e("InsertCommentOperation", e2.getMessage(), e2);
            this.f78098b.mo42241a(7, (Bundle) null, (Comment) null);
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        antn antn = this.f78098b;
        if (antn != null) {
            antn.mo42241a(8, (Bundle) null, (Comment) null);
        }
    }
}
