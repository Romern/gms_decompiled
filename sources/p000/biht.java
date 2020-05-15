package p000;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.places.p095ui.TouchableMapView;

/* renamed from: biht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biht extends Fragment implements View.OnTouchListener, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, afck, afcm, afcl, biir {

    /* renamed from: A */
    private boolean f120611A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f120612B;

    /* renamed from: a */
    public final C1245ok f120613a = new C1245ok();

    /* renamed from: b */
    public boolean f120614b;

    /* renamed from: c */
    public afgv f120615c;

    /* renamed from: d */
    public bihb f120616d;

    /* renamed from: e */
    public TouchableMapView f120617e;

    /* renamed from: f */
    public afcn f120618f;

    /* renamed from: g */
    public View f120619g;

    /* renamed from: h */
    public View f120620h;

    /* renamed from: i */
    public ImageView f120621i;

    /* renamed from: j */
    public View f120622j;

    /* renamed from: k */
    public afhg f120623k;

    /* renamed from: l */
    public afhb f120624l;

    /* renamed from: m */
    public Point f120625m;

    /* renamed from: n */
    public int f120626n;

    /* renamed from: o */
    public int f120627o;

    /* renamed from: p */
    public afgv f120628p;

    /* renamed from: q */
    public Drawable f120629q;

    /* renamed from: r */
    public int f120630r;

    /* renamed from: s */
    public int f120631s;

    /* renamed from: t */
    public bihr f120632t;

    /* renamed from: u */
    public boolean f120633u;

    /* renamed from: v */
    public boolean f120634v = true;

    /* renamed from: w */
    public boolean f120635w = false;

    /* renamed from: x */
    private View f120636x;

    /* renamed from: y */
    private C1255ou f120637y;

    /* renamed from: z */
    private bihs f120638z;

    /* renamed from: a */
    public static final void m102402a(afcn afcn, CameraPosition cameraPosition) {
        try {
            afcn.mo34749a(new afch(afci.m52841a().mo34781a(cameraPosition)));
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }

    /* renamed from: j */
    private final void m102404j() {
        bihr bihr = this.f120632t;
        if (bihr != null) {
            bikf bikf = (bikf) bihr;
            if (!bikf.f120772d) {
                biht biht = bikf.f120771c;
                if (!biht.f120611A) {
                    biht.f120611A = true;
                    if (biht.f120622j != null) {
                        biht.f120622j.startAnimation(AnimationUtils.loadAnimation(biht.getActivity(), C0126R.anim.slide_right));
                        biht.f120622j.setVisibility(8);
                    }
                    View view = biht.f120636x;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    if (biht.f120619g.getVisibility() == 0) {
                        Animation loadAnimation = AnimationUtils.loadAnimation(biht.getActivity(), C0126R.anim.slide_up);
                        loadAnimation.setFillAfter(true);
                        biht.f120619g.startAnimation(loadAnimation);
                        biht.f120620h.setVisibility(0);
                        int i = Build.VERSION.SDK_INT;
                        biht.f120619g.setAlpha(0.6f);
                        biht.f120621i.setVisibility(8);
                    }
                }
                bikf.f120772d = true;
            }
        }
        this.f120614b = true;
    }

    /* renamed from: b */
    public final void mo34744b() {
        bihr bihr;
        if (!this.f120633u && (bihr = this.f120632t) != null) {
            bikf bikf = (bikf) bihr;
            bikf.f120777i = null;
            if (!bikf.f120773e) {
                bikf.mo64702c();
            }
        }
    }

    /* renamed from: c */
    public final LatLng mo64619c() {
        afcn afcn;
        if (this.f120625m == null || (afcn = this.f120618f) == null) {
            return null;
        }
        return afcn.mo34759e().mo34765a(this.f120625m);
    }

    /* renamed from: d */
    public final LatLngBounds mo64621d() {
        Location c;
        afcn afcn = this.f120618f;
        if (afcn == null) {
            return new LatLngBounds(new LatLng(-90.0d, -180.0d), new LatLng(90.0d, 180.0d));
        }
        if ((!this.f120612B || this.f120633u) && this.f120634v && (c = afcn.mo34757c()) != null) {
            return new LatLngBounds(new LatLng(c.getLatitude() - 440.32d, c.getLongitude() - 440.32d), new LatLng(c.getLatitude() + 0.01d, c.getLongitude() + 0.01d));
        }
        afct e = this.f120618f.mo34759e();
        Point point = new Point(this.f120626n, 0);
        return new LatLngBounds(e.mo34765a(new Point(0, this.f120627o)), e.mo34765a(point));
    }

    /* renamed from: e */
    public final CameraPosition mo64622e() {
        afcn afcn = this.f120618f;
        if (afcn != null) {
            return afcn.mo34748a();
        }
        return null;
    }

    /* renamed from: f */
    public final void mo64623f() {
        if (this.f120633u) {
            mo64618b(true);
            View view = this.f120622j;
            if (view != null) {
                view.setVisibility(0);
            }
            getView().setVisibility(0);
            this.f120633u = false;
        }
    }

    /* renamed from: g */
    public final void mo64624g() {
        afhg afhg = this.f120623k;
        if (afhg != null) {
            afhg.mo34853a();
            this.f120623k = null;
        }
        afhb afhb = this.f120624l;
        if (afhb != null) {
            afhb.mo34841a();
            this.f120624l = null;
        }
    }

    /* renamed from: h */
    public final void mo64625h() {
        ((FrameLayout.LayoutParams) this.f120622j.getLayoutParams()).setMargins(0, 0, biix.m102462a(8.0f, getActivity()), biix.m102462a(8.0f, getActivity()));
    }

    /* renamed from: i */
    public final void mo64626i() {
        if (this.f120628p != null && mo64619c() != null) {
            LatLng c = mo64619c();
            double d = (double) this.f120631s;
            Double.isNaN(d);
            double degrees = Math.toDegrees(d / 6371010.0d) / 2.0d;
            double d2 = (double) this.f120630r;
            Double.isNaN(d2);
            double degrees2 = Math.toDegrees(d2 / (Math.cos(Math.toRadians(c.f79894a)) * 6371010.0d)) / 2.0d;
            LatLng latLng = new LatLng(c.f79894a + degrees, c.f79895b - degrees2);
            LatLng latLng2 = new LatLng(c.f79894a - degrees, c.f79895b + degrees2);
            Point a = this.f120618f.mo34759e().mo34764a(latLng);
            Point a2 = this.f120618f.mo34759e().mo34764a(latLng2);
            ((FrameLayout.LayoutParams) this.f120621i.getLayoutParams()).width = a2.x - a.x;
            ((FrameLayout.LayoutParams) this.f120621i.getLayoutParams()).height = a2.y - a.y;
            this.f120621i.requestLayout();
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C1255ou ouVar = new C1255ou(getActivity(), this);
        this.f120637y = ouVar;
        ouVar.f26824a.f26823a.setOnDoubleTapListener(this);
        this.f120622j.setOnTouchListener(new bihl(this));
        this.f120617e.mo43845a(bundle);
        TouchableMapView touchableMapView = this.f120617e;
        touchableMapView.f151373a = this;
        touchableMapView.mo43844a(new bihm(this));
        View findViewById = this.f120617e.findViewById(3);
        this.f120636x = findViewById;
        if (findViewById != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, biix.m102462a(48.0f, getActivity()));
        }
        bihs bihs = this.f120638z;
        if (bihs != null) {
            bihs.mo64614a();
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        afcr.m52860a(getActivity());
        try {
            this.f120638z = (bihs) activity;
        } catch (ClassCastException e) {
            Log.w("Places", String.valueOf(activity.toString()).concat(" does not implement ViewCompleteListener and will not be informed when this fragment's view is ready."));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.places_ui_marker_map, viewGroup, false);
        this.f120617e = (TouchableMapView) inflate.findViewById(C0126R.C0129id.marker_map);
        this.f120621i = (ImageView) inflate.findViewById(C0126R.C0129id.marker_map_center_overlay);
        View findViewById = inflate.findViewById(C0126R.C0129id.marker_map_my_location_button);
        this.f120622j = findViewById;
        findViewById.setOnClickListener(new bihk(this));
        this.f120619g = inflate.findViewById(C0126R.C0129id.marker_map_center_drop);
        this.f120620h = inflate.findViewById(C0126R.C0129id.marker_map_center_cross);
        this.f120615c = afgw.m53066a();
        return inflate;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f120618f = null;
        this.f120617e.mo43848c();
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        m102404j();
        return false;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        m102404j();
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        m102404j();
    }

    public final void onLowMemory() {
        super.onLowMemory();
        this.f120617e.mo43849d();
    }

    public final void onPause() {
        super.onPause();
        this.f120617e.mo43846b();
    }

    public final void onResume() {
        super.onResume();
        this.f120617e.mo43843a();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f120617e.mo43847b(bundle);
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        m102404j();
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        bihr bihr;
        if (this.f120633u) {
            return true;
        }
        this.f120637y.mo15671a(motionEvent);
        if (motionEvent.getAction() == 1 && (bihr = this.f120632t) != null) {
            bikf bikf = (bikf) bihr;
            if (bikf.f120772d) {
                biht biht = bikf.f120771c;
                if (biht.f120611A) {
                    if (biht.f120622j != null) {
                        biht.f120622j.startAnimation(AnimationUtils.loadAnimation(biht.getActivity(), C0126R.anim.slide_left));
                        biht.f120622j.setVisibility(0);
                    }
                    biht.f120636x.setVisibility(0);
                    if (biht.f120619g.getVisibility() == 0) {
                        biht.f120619g.startAnimation(AnimationUtils.loadAnimation(biht.getActivity(), C0126R.anim.slide_down));
                        biht.f120620h.setVisibility(8);
                        int i = Build.VERSION.SDK_INT;
                        biht.f120619g.setAlpha(1.0f);
                        biht.mo64626i();
                        biht.f120621i.setVisibility(0);
                    }
                    biht.f120611A = false;
                }
                bikf.f120772d = false;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void mo64620c(boolean z) {
        this.f120617e.mo43844a(new bihi(this, z));
    }

    /* renamed from: b */
    public final void mo64618b(boolean z) {
        this.f120617e.mo43844a(new bihe(z));
    }

    /* renamed from: a */
    public final void mo34743a() {
        bihr bihr = this.f120632t;
        if (bihr != null) {
            bikf bikf = (bikf) bihr;
            if (!bikf.f120773e && bikf.f120777i == null) {
                CameraPosition e = bikf.f120771c.mo64622e();
                if (!sdg.m34949a(bikf.f120776h, e)) {
                    bikf.f120776h = e;
                    bikf.mo64702c();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo64615a(aelh aelh) {
        this.f120617e.mo43844a(new bihf(this, aelh));
    }

    /* renamed from: a */
    public final void mo64616a(LatLng latLng) {
        this.f120617e.mo43844a(new bihp(this, latLng));
    }

    /* renamed from: a */
    public final void mo64617a(boolean z) {
        if (z) {
            mo64624g();
            this.f120619g.setVisibility(0);
            mo64626i();
            if (!this.f120611A && this.f120628p != null) {
                this.f120621i.setVisibility(0);
                return;
            }
            return;
        }
        this.f120619g.setVisibility(8);
        this.f120620h.setVisibility(8);
        this.f120621i.setVisibility(8);
    }

    /* renamed from: a */
    public final boolean mo34745a(afhg afhg) {
        aelh aelh = (aelh) this.f120613a.get(afhg.mo34854b());
        if (aelh != null) {
            mo64617a(false);
            mo64615a(aelh);
            bihr bihr = this.f120632t;
            if (bihr != null) {
                bikf bikf = (bikf) bihr;
                bikf.f120777i = aelh;
                bikf.mo64701a(aelh);
            }
        }
        return true;
    }
}
