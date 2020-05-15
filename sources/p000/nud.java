package p000;

import android.app.Presentation;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

/* renamed from: nud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nud extends Presentation {

    /* renamed from: h */
    public static final /* synthetic */ int f36496h = 0;

    /* renamed from: a */
    View f36497a;

    /* renamed from: b */
    public boolean f36498b;

    /* renamed from: c */
    boolean f36499c;

    /* renamed from: d */
    public final Rect f36500d;

    /* renamed from: e */
    public boolean f36501e;

    /* renamed from: f */
    public WeakReference f36502f;

    /* renamed from: g */
    public final nqr f36503g;

    /* renamed from: i */
    private final boolean f36504i;

    /* renamed from: j */
    private final boolean f36505j;

    /* renamed from: k */
    private View f36506k;

    /* renamed from: l */
    private final Queue f36507l;

    /* renamed from: a */
    public final Window mo21589a() {
        return (Window) Objects.requireNonNull(getWindow(), String.valueOf((Object) null).concat(" getWindow() returned null"));
    }

    public final void cancel() {
        if (!this.f36499c) {
            super.cancel();
        }
    }

    public final void dismiss() {
        if (!this.f36499c) {
            super.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        this.f36507l.clear();
        super.onStop();
    }

    public final void setContentView(View view) {
        View view2;
        int i;
        if (this.f36506k != view) {
            this.f36506k = view;
            this.f36497a = new nub(this, getContext(), view);
            int i2 = mo21589a().getAttributes().flags & 1024;
            if (!this.f36504i && (view2 = this.f36497a) != null) {
                if (i2 == 0) {
                    i = 0;
                } else {
                    i = 4;
                }
                view2.setSystemUiVisibility(i);
            }
            super.setContentView(this.f36497a);
        }
    }

    public final void show() {
        super.show();
        new adzt().post(new nua(this));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public nud(Context context, Display display) {
        super(context, display, r4);
        int i;
        if (context instanceof Service) {
            ComponentName componentName = new ComponentName(context, context.getClass());
            try {
                Bundle bundle = context.getPackageManager().getServiceInfo(componentName, 128).metaData;
                i = context.getApplicationInfo().theme;
                if (bundle != null) {
                    i = bundle.getInt("android.app.theme", i);
                }
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(componentName);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
                sb.append("Could not get theme for component ");
                sb.append(valueOf);
                sb.append("; use the default theme");
                Log.e("CAR.PROJECTION.PRES", sb.toString());
                i = 0;
            }
        } else if (nly.m26778a("CAR.PROJECTION.PRES", 3)) {
            Log.d("CAR.PROJECTION.PRES", "getTheme: context not an instance of service");
            i = 0;
        } else {
            i = 0;
        }
        this.f36499c = false;
        this.f36505j = true;
        this.f36500d = new Rect();
        new Rect();
        this.f36507l = new ArrayDeque();
        this.f36502f = new WeakReference(null);
        new nuc();
        new ntw(this);
        new ntx(this);
        new nty(this);
        new ntz(this);
        this.f36503g = new nqr();
        Pair.create(0, null);
        Pair.create(-1, null);
        Pair.create(2, null);
        Window a = mo21589a();
        a.setType(2030);
        a.addFlags(16777216);
        a.addFlags(8);
        this.f36504i = true;
        a.addFlags(1024);
        a.setSoftInputMode(48);
    }

    /* renamed from: a */
    public final void mo21590a(View view) {
        if (!this.f36505j) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int i = 0;
                while (i < viewGroup.getChildCount()) {
                    if (!viewGroup.getChildAt(i).hasFocusable()) {
                        i++;
                    } else if (view.isFocusable()) {
                        view.setFocusable(false);
                        if (nly.m26778a("CAR.PROJECTION.PRES", 3)) {
                            Log.d("CAR.PROJECTION.PRES", String.format("%s ensureFocusable set view to non-focusable because it has focusable children: %s", null, view));
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
            view.setFocusable(true);
            if (!view.requestFocus() && nly.m26778a("CAR.PROJECTION.PRES", 5)) {
                Log.w("CAR.PROJECTION.PRES", String.format("%s requestFocus() on %s returned false", null, view));
            }
            if (nly.m26778a("CAR.PROJECTION.PRES", 3)) {
                Log.d("CAR.PROJECTION.PRES", String.format("%s ensureFocusable set view to focusable because it has no focusable children: %s", null, view));
            }
        }
    }
}
