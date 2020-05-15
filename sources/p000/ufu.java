package p000;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.ExecutorService;

/* renamed from: ufu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ufu {

    /* renamed from: a */
    public static final sbw f47470a = new sbw("ContentDownloadManager", "");

    /* renamed from: k */
    private static final String f47471k = String.valueOf((String) twy.f46800K.mo58455c()).concat("%sfiles/%s?alt=media");

    /* renamed from: b */
    public final Context f47472b;

    /* renamed from: c */
    public final ugf f47473c;

    /* renamed from: d */
    public final uff f47474d;

    /* renamed from: e */
    public final ufr f47475e = new ufr(this);

    /* renamed from: f */
    public final ufr f47476f = new ufr(this);

    /* renamed from: g */
    public final uhn f47477g;

    /* renamed from: h */
    public final ufe f47478h;

    /* renamed from: i */
    public final ufb f47479i;

    /* renamed from: j */
    public final ExecutorService f47480j = sne.m35694a(((Integer) twy.f46815Z.mo58455c()).intValue(), 9);

    public ufu(Context context, ugf ugf, uff uff, uhn uhn, ufe ufe) {
        sdo.m34959a(context);
        this.f47472b = context;
        sdo.m34959a(ugf);
        this.f47473c = ugf;
        sdo.m34959a(uff);
        this.f47474d = uff;
        sdo.m34959a(uhn);
        this.f47477g = uhn;
        sdo.m34959a(ufe);
        this.f47478h = ufe;
        this.f47479i = new ufb();
    }

    /* renamed from: a */
    public final uga mo27303a(uey uey, ujx ujx, vfb vfb) {
        String i = ujx.mo27616i();
        String l = ujx.mo27624l();
        Uri.Builder buildUpon = Uri.parse(String.format(f47471k, !((Boolean) twy.f46871bb.mo58455c()).booleanValue() ? "/drive/v2beta/" : vkx.m40758b(), i)).buildUpon();
        if (l != null) {
            buildUpon.appendQueryParameter("revisionId", l);
        }
        if (ujx.mo27573ai()) {
            buildUpon.appendQueryParameter("fileScopeAppIds", ujx.mo27643z());
        }
        vkx.m40757a(buildUpon);
        String uri = buildUpon.build().toString();
        uey a = ((Boolean) twy.f46871bb.mo58455c()).booleanValue() ? uey.m38255a(uey.f47394a) : uey;
        ukk a2 = ujx.mo27551a();
        if (this.f47474d.mo27283a(ujx)) {
            f47470a.mo25368a("ContentDownloadManager", "Up-to-date file is already available locally: %s", ujx.mo27551a());
            return new uga(3);
        } else if (!ujx.mo27568ad()) {
            throw new aaaj(10, "No content is available for this file.");
        } else if (!ujx.mo27566ab()) {
            return this.f47475e.mo27301a(a2, new ufo(this, a, uri, ujx, vfb));
        } else {
            throw new AssertionError("Local document not available locally. This should not happen");
        }
    }
}
