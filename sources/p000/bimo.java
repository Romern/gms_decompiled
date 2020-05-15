package p000;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* renamed from: bimo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bimo extends FrameLayout implements bimx, bilu, afcp {

    /* renamed from: a */
    public final bimy f120912a;

    /* renamed from: b */
    public final bimf f120913b;

    /* renamed from: c */
    public final MapView f120914c;

    /* renamed from: d */
    public afcn f120915d;

    /* renamed from: e */
    public afhb f120916e;

    /* renamed from: f */
    public afgv f120917f;

    /* renamed from: g */
    public int f120918g;

    /* renamed from: h */
    public int f120919h;

    /* renamed from: i */
    public final ArrayList f120920i = new ArrayList();

    /* renamed from: j */
    public afcj f120921j;

    /* renamed from: k */
    private final bilv f120922k;

    /* renamed from: l */
    private final Animation f120923l;

    /* renamed from: m */
    private final Animation f120924m;

    /* renamed from: n */
    private final View f120925n;

    /* renamed from: o */
    private int f120926o;

    /* renamed from: p */
    private boolean f120927p;

    /* renamed from: q */
    private final Rect f120928q = new Rect();

    /* renamed from: r */
    private final Rect f120929r = new Rect();

    public bimo(Context context, bimy bimy, bilv bilv) {
        super(context);
        this.f120912a = bimy;
        this.f120922k = bilv;
        this.f120913b = new bimf(this.f120912a, this, bihb.m102385a(getContext()));
        this.f120923l = AnimationUtils.loadAnimation(context, C0126R.anim.place_picker_show_search_bar);
        this.f120924m = AnimationUtils.loadAnimation(context, C0126R.anim.place_picker_hide_search_bar);
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.place_picker_marker_map, this);
        View findViewById = findViewById(C0126R.C0129id.search_bar);
        this.f120925n = findViewById;
        findViewById.setOnClickListener(new bimg(this));
        findViewById(C0126R.C0129id.my_location_button).setOnClickListener(new bimh(this));
        findViewById(C0126R.C0129id.select_marker_location).setOnClickListener(new bimi(this));
        MapView mapView = (MapView) findViewById(C0126R.C0129id.map);
        this.f120914c = mapView;
        this.f120922k.mo64749a(mapView);
        this.f120914c.mo43844a(new bimj(this));
        this.f120926o = 0;
        this.f120912a.mo64775a(this);
    }

    /* renamed from: a */
    public final void mo64764a() {
        if (this.f120915d != null) {
            ArrayList arrayList = this.f120920i;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((afhg) arrayList.get(i)).mo34853a();
            }
            this.f120920i.clear();
        }
    }

    /* renamed from: b */
    public final void mo64767b(boolean z) {
        if (this.f120915d != null) {
            if (this.f120916e == null) {
                if (this.f120917f != null) {
                    GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions();
                    groundOverlayOptions.mo43863a(this.f120917f);
                    groundOverlayOptions.mo43864a(new LatLng(0.0d, 0.0d), (float) this.f120918g, (float) this.f120919h);
                    groundOverlayOptions.mo43862a(0.6f);
                    groundOverlayOptions.f79888g = false;
                    this.f120916e = this.f120915d.mo34746a(groundOverlayOptions);
                } else {
                    return;
                }
            }
            if (z) {
                try {
                    this.f120916e.f64243a.mo34883a(this.f120915d.mo34748a().f79866a);
                    this.f120916e.mo34842a(true);
                } catch (RemoteException e) {
                    throw new afhl(e);
                }
            } else {
                this.f120916e.mo34842a(false);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean fitSystemWindows(Rect rect) {
        int i = rect.top;
        int i2 = this.f120926o;
        this.f120926o = rect.top;
        ((FrameLayout.LayoutParams) this.f120925n.getLayoutParams()).topMargin += i - i2;
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View findViewById = findViewById(C0126R.C0129id.selected_location_marker);
        this.f120928q.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        this.f120929r.set(this.f120925n.getLeft(), this.f120925n.getTop(), this.f120925n.getRight(), this.f120925n.getBottom());
        this.f120928q.offset(0, -findViewById.getHeight());
        int i5 = getResources().getConfiguration().orientation;
        if (!this.f120928q.intersect(this.f120929r) || i5 != 2) {
            this.f120927p = false;
            return;
        }
        this.f120927p = true;
        mo64766a(false);
    }

    /* renamed from: a */
    public final void mo64748a(Rect rect) {
        fitSystemWindows(rect);
    }

    /* renamed from: a */
    public final void mo64765a(LatLng latLng, boolean z) {
        if (this.f120915d != null) {
            afch a = afci.m52839a(latLng);
            if (z) {
                this.f120915d.mo34756b(a);
            } else {
                this.f120915d.mo34749a(a);
            }
        }
    }

    /* renamed from: a */
    public final void mo64766a(boolean z) {
        if (!this.f120927p && z) {
            binh.m102604a(this.f120923l, this.f120925n, 0);
        } else {
            binh.m102604a(this.f120924m, this.f120925n, 4);
        }
    }
}
