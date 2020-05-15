package p000;

import com.android.volley.Response;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.service.v1whitelisted.models.AclEntity;
import java.util.Formatter;

/* renamed from: aodi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aodi extends shd {

    /* renamed from: a */
    public final shj f78219a;

    public aodi(shj shj) {
        this.f78219a = shj;
        shj.f44447g = 6400;
    }

    /* renamed from: a */
    public final AclEntity mo42549a(ClientContext clientContext, String str, String str2, String str3, AclEntity aclEntity) {
        StringBuilder sb = new StringBuilder();
        new Formatter(sb).format("applications/%1$s/acl/%2$s", shd.m35267a(str), shd.m35267a(str2));
        if (str3 != null) {
            shd.m35269a(sb, "language", shd.m35267a(str3));
        }
        return (AclEntity) this.f78219a.mo25536a(clientContext, 2, sb.toString(), aclEntity, AclEntity.class);
    }

    /* renamed from: b */
    public final void mo42552b(ClientContext clientContext, String str, String str2, String str3, Response.Listener listener, Response.ErrorListener errorListener) {
        StringBuilder sb = new StringBuilder();
        new Formatter(sb).format("authCategories/%1$s/acl/%2$s", shd.m35267a(str), shd.m35267a(str2));
        if (str3 != null) {
            shd.m35269a(sb, "language", shd.m35267a(str3));
        }
        this.f78219a.mo25540a(clientContext, sb.toString(), AclEntity.class, listener, errorListener);
    }

    /* renamed from: a */
    public final void mo42550a(ClientContext clientContext, String str, String str2, AclEntity aclEntity) {
        StringBuilder sb = new StringBuilder();
        new Formatter(sb).format("authCategories/%1$s/acl/%2$s", shd.m35267a(str), shd.m35267a(str2));
        AclEntity aclEntity2 = (AclEntity) this.f78219a.mo25536a(clientContext, 2, sb.toString(), aclEntity, AclEntity.class);
    }

    /* renamed from: a */
    public final void mo42551a(ClientContext clientContext, String str, String str2, String str3, Response.Listener listener, Response.ErrorListener errorListener) {
        StringBuilder sb = new StringBuilder();
        new Formatter(sb).format("applications/%1$s/acl/%2$s", shd.m35267a(str), shd.m35267a(str2));
        if (str3 != null) {
            shd.m35269a(sb, "language", shd.m35267a(str3));
        }
        this.f78219a.mo25540a(clientContext, sb.toString(), AclEntity.class, listener, errorListener);
    }
}
