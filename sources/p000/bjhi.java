package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import com.android.volley.toolbox.ImageLoader;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentManager;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;

/* renamed from: bjhi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjhi {

    /* renamed from: a */
    public final WidgetConfig f122724a;

    /* renamed from: b */
    public final long f122725b;

    /* renamed from: c */
    public final bjgo f122726c;

    /* renamed from: d */
    public final Activity f122727d;

    /* renamed from: e */
    public final ImageLoader f122728e;

    /* renamed from: f */
    LayoutInflater f122729f;

    /* renamed from: g */
    public final bjfi f122730g;

    /* renamed from: h */
    public final bjhh f122731h;

    /* renamed from: i */
    public final ContextWrapper f122732i;

    /* renamed from: j */
    public final String f122733j;

    /* renamed from: k */
    final bjle f122734k;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bjhf.a(android.content.Context, com.google.android.wallet.bender3.framework.client.WidgetConfig):boolean
     arg types: [com.google.android.chimera.Activity, com.google.android.wallet.bender3.framework.client.WidgetConfig]
     candidates:
      bjhf.a(android.content.ContextWrapper, com.google.android.wallet.bender3.framework.client.WidgetConfig):void
      bjhf.a(android.content.Context, com.google.android.wallet.bender3.framework.client.WidgetConfig):boolean */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bjhf.a(android.content.ContextWrapper, com.google.android.wallet.bender3.framework.client.WidgetConfig):void
     arg types: [com.google.android.chimera.Activity, com.google.android.wallet.bender3.framework.client.WidgetConfig]
     candidates:
      bjhf.a(android.content.Context, com.google.android.wallet.bender3.framework.client.WidgetConfig):boolean
      bjhf.a(android.content.ContextWrapper, com.google.android.wallet.bender3.framework.client.WidgetConfig):void */
    public bjhi(WidgetConfig widgetConfig, long j, bjgo bjgo, bjle bjle, Activity activity, ImageLoader imageLoader, bjfi bjfi, String str, bjhh bjhh) {
        this.f122724a = widgetConfig;
        this.f122725b = j;
        this.f122726c = bjgo;
        this.f122734k = bjle;
        this.f122727d = activity;
        this.f122728e = imageLoader;
        this.f122730g = bjfi;
        this.f122731h = bjhh;
        this.f122733j = str;
        this.f122732i = activity;
        bjhf.m103484a((Context) activity, widgetConfig);
        bjhf.m103483a((ContextWrapper) activity, widgetConfig);
    }

    /* renamed from: a */
    public final LayoutInflater mo65227a() {
        if (this.f122729f == null) {
            this.f122729f = LayoutInflater.from(this.f122732i);
        }
        return this.f122729f;
    }

    /* renamed from: b */
    public final FragmentManager mo65228b() {
        return this.f122727d.getSupportFragmentManager();
    }
}
