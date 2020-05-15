package p000;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.internal.model.File;
import java.util.Formatter;

/* renamed from: vld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vld extends shd {

    /* renamed from: a */
    public final shj f49433a;

    public vld(shj shj) {
        this.f49433a = shj;
    }

    /* renamed from: a */
    public final File mo28610a(ClientContext clientContext, String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, Boolean bool4, Boolean bool5, String str3, Integer num, Boolean bool6, shc shc) {
        StringBuilder sb = new StringBuilder();
        new Formatter(sb).format("files/%1$s", shd.m35267a(str));
        shc.mo25531a(sb);
        shd.m35269a(sb, "acknowledgeAbuse", String.valueOf(bool));
        shd.m35269a(sb, "allProperties", String.valueOf(bool2));
        if (bool3 != null) {
            shd.m35269a(sb, "errorRecovery", String.valueOf(bool3));
        }
        if (str2 != null) {
            shd.m35269a(sb, "fileScopeAppIds", shd.m35267a(str2));
        }
        if (bool4 != null) {
            shd.m35269a(sb, "mutationPrecondition", String.valueOf(bool4));
        }
        if (bool5 != null) {
            shd.m35269a(sb, "openDrive", String.valueOf(bool5));
        }
        if (str3 != null) {
            shd.m35269a(sb, "reason", shd.m35267a(str3));
        }
        if (num != null) {
            shd.m35269a(sb, "syncType", String.valueOf(num));
        }
        shd.m35269a(sb, "updateViewedDate", String.valueOf(bool6));
        return (File) this.f49433a.mo25536a(clientContext, 0, sb.toString(), (Object) null, File.class);
    }

    /* renamed from: a */
    public final File mo28611a(ClientContext clientContext, String str, Boolean bool, Boolean bool2, String str2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str3, Boolean bool8, Integer num, Boolean bool9, Boolean bool10, File file, shc shc) {
        StringBuilder sb = new StringBuilder();
        new Formatter(sb).format("files/%1$s", shd.m35267a(str));
        shc.mo25531a(sb);
        shd.m35269a(sb, "convert", String.valueOf(bool));
        if (bool2 != null) {
            shd.m35269a(sb, "errorRecovery", String.valueOf(bool2));
        }
        if (str2 != null) {
            shd.m35269a(sb, "modifiedDateBehavior", shd.m35267a(str2));
        }
        if (bool3 != null) {
            shd.m35269a(sb, "mutationPrecondition", String.valueOf(bool3));
        }
        shd.m35269a(sb, "newRevision", String.valueOf(bool4));
        shd.m35269a(sb, "ocr", String.valueOf(bool5));
        if (bool6 != null) {
            shd.m35269a(sb, "openDrive", String.valueOf(bool6));
        }
        shd.m35269a(sb, "pinned", String.valueOf(bool7));
        if (str3 != null) {
            shd.m35269a(sb, "reason", shd.m35267a(str3));
        }
        shd.m35269a(sb, "setModifiedDate", String.valueOf(bool8));
        if (num != null) {
            shd.m35269a(sb, "syncType", String.valueOf(num));
        }
        shd.m35269a(sb, "updateViewedDate", String.valueOf(bool9));
        shd.m35269a(sb, "useContentAsIndexableText", String.valueOf(bool10));
        return (File) this.f49433a.mo25536a(clientContext, 2, sb.toString(), file, File.class);
    }

    /* renamed from: a */
    public final void mo28612a(ClientContext clientContext, String str, String str2, String str3, File file, shc shc) {
        StringBuilder sb = new StringBuilder();
        new Formatter(sb).format("files/%1$s", shd.m35267a(str));
        shc.mo25531a(sb);
        if (str2 != null) {
            shd.m35269a(sb, "addParents", shd.m35267a(str2));
        }
        if (str3 != null) {
            shd.m35269a(sb, "removeParents", shd.m35267a(str3));
        }
        File file2 = (File) this.f49433a.mo25536a(clientContext, 7, sb.toString(), file, File.class);
    }
}
