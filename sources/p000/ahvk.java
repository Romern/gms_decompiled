package p000;

import android.app.Notification;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.widget.LinearLayout;
import android.widget.RemoteViews;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ahvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahvk extends aicx {

    /* renamed from: G */
    private final Context f68163G;

    /* renamed from: H */
    private final boolean f68164H;

    /* renamed from: I */
    private final RemoteViews f68165I;

    public ahvk(Context context, boolean z) {
        super(context);
        this.f68163G = context;
        this.f68164H = z;
        RemoteViews a = m56726a(context, (int) C0126R.C0128layout.fast_pair_heads_up_notification);
        this.f68165I = a;
        if (a != null) {
            this.f22271w = context.getResources().getColor(C0126R.color.discovery_activity_accent);
            this.f68165I.setViewVisibility(16908303, 8);
        }
    }

    /* renamed from: b */
    public final Notification mo13629b() {
        if (this.f68165I != null) {
            if (cfoj.m141558h()) {
                try {
                    RemoteViews remoteViews = this.f68165I;
                    Context context = this.f68163G;
                    remoteViews.apply(context, new LinearLayout(context));
                } catch (Resources.NotFoundException e) {
                    bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68405a("Failed to build notification, not setting custom view.");
                }
            }
            this.f22243A = this.f68165I;
        }
        return super.mo13629b();
    }

    /* renamed from: c */
    public final void mo13636c(CharSequence charSequence) {
        if (this.f68165I != null && cfoj.f184966a.mo6606a().mo82090aN()) {
            this.f68165I.setTextViewText(16908309, charSequence);
        }
        super.mo13636c(charSequence);
    }

    /* renamed from: e */
    public final void mo13640e(CharSequence charSequence) {
        RemoteViews remoteViews = this.f68165I;
        if (remoteViews != null) {
            remoteViews.setTextViewText(16908310, charSequence);
        }
        super.mo13640e(charSequence);
    }

    /* renamed from: a */
    public static RemoteViews m56726a(Context context, int i) {
        for (ApplicationInfo applicationInfo : context.getPackageManager().getInstalledApplications(0)) {
            if (applicationInfo != null && applicationInfo.packageName != null && applicationInfo.packageName.equals("com.google.android.gms.policy_nearby")) {
                srn srn = ahsd.f67925a;
                return new RemoteViews("com.google.android.gms.policy_nearby", i);
            }
        }
        try {
            int a = qkj.m32287a(context, i);
            if (a == 0) {
                ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("FastPair: No valid container resources for notification.");
                return null;
            }
            srn srn2 = ahsd.f67925a;
            return new RemoteViews(context.getPackageName(), a);
        } catch (Resources.NotFoundException e) {
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("FastPair: Could not find resources, falling back to default notification style.");
            return null;
        }
    }

    /* renamed from: b */
    public final void mo13632b(CharSequence charSequence) {
        RemoteViews remoteViews = this.f68165I;
        if (remoteViews != null) {
            remoteViews.setTextViewText(16908308, charSequence);
        }
        C1101jd jdVar = new C1101jd();
        jdVar.mo13593a(charSequence);
        mo13626a(jdVar);
        super.mo13632b(charSequence);
    }

    /* renamed from: a */
    public final void mo13617a(int i, int i2, boolean z) {
        RemoteViews remoteViews = this.f68165I;
        if (remoteViews != null) {
            remoteViews.setViewVisibility(16908303, 0);
            this.f68165I.setProgressBar(16908301, i, i2, z);
        }
        super.mo13617a(i, i2, z);
    }

    /* renamed from: a */
    public final void mo13621a(Bitmap bitmap) {
        int i;
        if (this.f68165I != null) {
            Context context = this.f68163G;
            if (!this.f68164H) {
                i = C0126R.C0128layout.fast_pair_heads_up_notification_small_image;
            } else {
                i = C0126R.C0128layout.fast_pair_heads_up_notification_large_image;
            }
            RemoteViews a = m56726a(context, i);
            if (a != null) {
                a.setImageViewBitmap(16908294, bitmap);
                if (cfoj.f184966a.mo6606a().mo82185r()) {
                    this.f68165I.removeAllViews(16908295);
                }
                this.f68165I.addView(16908295, a);
            }
        }
        super.mo13621a(bitmap);
    }
}
