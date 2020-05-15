package com.google.android.gms.ads.internal.mraid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.client.C0341h;
import com.google.android.gms.ads.internal.common.C0355a;
import com.google.android.gms.ads.internal.common.C0356b;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.gmsg.C0426e;
import com.google.android.gms.ads.internal.util.C0616an;
import com.google.android.gms.ads.internal.util.C0658o;
import com.google.android.gms.ads.internal.util.client.C0626a;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.internal.webview.C0699i;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.mraid.c */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0514c extends C0515d implements C0426e {

    /* renamed from: a */
    public final C0699i f8520a;

    /* renamed from: b */
    DisplayMetrics f8521b;

    /* renamed from: c */
    int f8522c = -1;

    /* renamed from: d */
    int f8523d = -1;

    /* renamed from: e */
    int f8524e = -1;

    /* renamed from: f */
    int f8525f = -1;

    /* renamed from: g */
    int f8526g = -1;

    /* renamed from: i */
    private final Context f8527i;

    /* renamed from: j */
    private final WindowManager f8528j;

    /* renamed from: k */
    private final C0356b f8529k;

    /* renamed from: l */
    private float f8530l;

    /* renamed from: m */
    private int f8531m;

    public C0514c(C0699i iVar, Context context, C0356b bVar) {
        super(iVar);
        this.f8520a = iVar;
        this.f8527i = context;
        this.f8529k = bVar;
        this.f8528j = (WindowManager) context.getSystemService("window");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6625a(Object obj, Map map) {
        boolean z;
        JSONObject jSONObject;
        int i;
        View findViewById;
        C0699i iVar = (C0699i) obj;
        this.f8521b = new DisplayMetrics();
        Display defaultDisplay = this.f8528j.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f8521b);
        this.f8530l = this.f8521b.density;
        this.f8531m = defaultDisplay.getRotation();
        C0626a a = C0341h.m5274a();
        DisplayMetrics displayMetrics = this.f8521b;
        this.f8522c = a.mo6804a(displayMetrics, displayMetrics.widthPixels);
        C0626a a2 = C0341h.m5274a();
        DisplayMetrics displayMetrics2 = this.f8521b;
        this.f8523d = a2.mo6804a(displayMetrics2, displayMetrics2.heightPixels);
        Activity c = this.f8520a.mo6918c();
        int i2 = 0;
        if (c == null || c.getWindow() == null) {
            this.f8524e = this.f8522c;
            this.f8525f = this.f8523d;
        } else {
            int[] a3 = C0387d.m5363a().mo6858a(c);
            this.f8524e = C0341h.m5274a().mo6804a(this.f8521b, a3[0]);
            this.f8525f = C0341h.m5274a().mo6804a(this.f8521b, a3[1]);
        }
        this.f8520a.mo6922f();
        this.f8520a.measure(0, 0);
        mo6699a(this.f8522c, this.f8523d, this.f8524e, this.f8525f, this.f8530l, this.f8531m);
        C0512a aVar = new C0512a();
        C0356b bVar = this.f8529k;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        aVar.f8511b = bVar.mo6597a(intent);
        C0356b bVar2 = this.f8529k;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        aVar.f8510a = bVar2.mo6597a(intent2);
        C0356b bVar3 = this.f8529k;
        Intent type = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event");
        int i3 = Build.VERSION.SDK_INT;
        aVar.f8512c = bVar3.mo6597a(type);
        C0356b bVar4 = this.f8529k;
        if (((Boolean) C0616an.m5619a(bVar4.f8165a, new C0355a())).booleanValue()) {
            z = svr.m36484b(bVar4.f8165a).mo26169a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        } else {
            z = false;
        }
        aVar.f8513d = z;
        aVar.f8514e = true;
        C0513b bVar5 = new C0513b(aVar);
        C0699i iVar2 = this.f8520a;
        try {
            jSONObject = new JSONObject().put("sms", bVar5.f8515a).put("tel", bVar5.f8516b).put("calendar", bVar5.f8517c).put("storePicture", bVar5.f8518d).put("inlineVideo", bVar5.f8519e);
        } catch (JSONException e) {
            C0633h.m5669b("Error occured while obtaining the MRAID capabilities.", e);
            jSONObject = null;
        }
        iVar2.mo6641a("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.f8520a.getLocationOnScreen(iArr);
        int a4 = C0341h.m5274a().mo6803a(this.f8527i, iArr[0]);
        int a5 = C0341h.m5274a().mo6803a(this.f8527i, iArr[1]);
        if (this.f8527i instanceof Activity) {
            C0658o a6 = C0387d.m5363a();
            Activity activity = (Activity) this.f8527i;
            Window window = activity.getWindow();
            int[] b = (window == null || (findViewById = window.findViewById(16908290)) == null) ? a6.mo6862b() : new int[]{findViewById.getTop(), findViewById.getBottom()};
            i = new int[]{C0341h.m5274a().mo6803a(activity, b[0]), C0341h.m5274a().mo6803a(activity, b[1])}[0];
        } else {
            i = 0;
        }
        if (this.f8520a.mo6922f() != null) {
            this.f8520a.mo6922f();
        }
        int width = this.f8520a.getWidth();
        int height = this.f8520a.getHeight();
        if (!((Boolean) C0371o.f8256i.mo6604a()).booleanValue()) {
            i2 = height;
        } else {
            if (width == 0 && this.f8520a.mo6922f() != null) {
                int i4 = this.f8520a.mo6922f().f9036b;
                width = 0;
            }
            if (height != 0 || this.f8520a.mo6922f() == null) {
                i2 = height;
            } else {
                int i5 = this.f8520a.mo6922f().f9035a;
            }
        }
        this.f8526g = C0341h.m5274a().mo6803a(this.f8527i, width);
        try {
            this.f8532h.mo6641a("onDefaultPositionReceived", new JSONObject().put("x", a4).put("y", a5 - i).put("width", this.f8526g).put("height", C0341h.m5274a().mo6803a(this.f8527i, i2)));
        } catch (JSONException e2) {
            C0633h.m5669b("Error occurred while dispatching default position.", e2);
        }
        this.f8520a.mo6923g().mo6889e();
        if (C0633h.m5667a(2)) {
            C0633h.m5670c("Dispatching Ready Event.");
        }
        try {
            this.f8532h.mo6641a("onReadyEventReceived", new JSONObject().put("js", this.f8520a.mo6930j().f8949a));
        } catch (JSONException e3) {
            C0633h.m5669b("Error occurred while dispatching ready Event.", e3);
        }
    }
}
