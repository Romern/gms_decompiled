package p000;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.drive.internal.model.File;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* renamed from: ugv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ugv {
    /* renamed from: a */
    public static final File m38380a(InputStream inputStream) {
        File file = new File();
        try {
            new sja().mo25625a(inputStream, file);
            return file;
        } catch (IllegalStateException e) {
            throw new ugr("Failed to process contents", e);
        } catch (siy e2) {
            throw new ugr("Failed to process contents", e2);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: vkv.a(java.lang.Class, boolean):java.lang.String
     arg types: [java.lang.Class, int]
     candidates:
      vkv.a(java.lang.String, boolean):com.google.android.gms.drive.internal.model.FileLocalId
      vkv.a(com.google.android.gms.common.internal.ClientContext, com.google.android.gms.drive.internal.model.File):vkr
      vkv.a(com.google.android.gms.common.internal.ClientContext, int):vla
      vkv.a(int, com.google.android.gms.drive.internal.model.Permission):void
      vkv.a(java.lang.Class, boolean):java.lang.String */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067  */
    /* renamed from: a */
    public static URL m38381a(String str, Map map) {
        try {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter("fields", vkv.m40740a(File.class, false));
            if (vkx.m40756a() != null) {
                vkx.m40757a(buildUpon);
            }
            for (Map.Entry entry : map.entrySet()) {
                buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            str = buildUpon.build().toString();
            try {
                return new URL(str);
            } catch (MalformedURLException e) {
                e = e;
                String valueOf = String.valueOf(str);
                throw new ugr(valueOf.length() != 0 ? new String("Invalid URI: ") : "Invalid URI: ".concat(valueOf), e);
            }
        } catch (MalformedURLException e2) {
            e = e2;
            String valueOf2 = String.valueOf(str);
            throw new ugr(valueOf2.length() != 0 ? new String("Invalid URI: ") : "Invalid URI: ".concat(valueOf2), e);
        }
    }

    /* renamed from: a */
    public final ugu mo27351a(ugt ugt, vpu vpu, vcx vcx) {
        return mo27352a(ugt, vpu, vcx, true);
    }

    /* renamed from: a */
    public final ugu mo27352a(ugt ugt, vpu vpu, vcx vcx, boolean z) {
        ugu ugu;
        ugt ugt2 = ugt;
        vpu vpu2 = vpu;
        Context context = vpu2.f49755b;
        ufb ufb = new ufb();
        if (z) {
            ugu = ugj.m38333a(context, ugt, vpu2.f49764k, vpu2.f49757d, ufb, vpu2.f49771r, vpu2.f49772s, vpu2.f49773t, vcx, this);
        } else {
            ugu = null;
        }
        if (ugu == null) {
            ugl ugl = vpu2.f49773t;
            ugu = ugo.m38354a(context, ugt2, ufb, this);
        }
        if (ugu == null) {
            ugu = ugp.m38359a(context, ugt2, ufb, this);
        }
        if (ugu != null) {
            return ugu;
        }
        String valueOf = String.valueOf(ugt);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("No uploader found:");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }
}
