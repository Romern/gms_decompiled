package p000;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.gms.ocr.camera.CameraPreviewLayout;
import java.util.concurrent.TimeUnit;

/* renamed from: akpv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class akpv extends Fragment implements SurfaceHolder.Callback, akrb, akrd {

    /* renamed from: a */
    public akrj f72402a;

    /* renamed from: b */
    public cijl f72403b;

    /* renamed from: c */
    public akug f72404c;

    /* renamed from: d */
    public aksc f72405d;

    /* renamed from: e */
    akql f72406e;

    /* renamed from: f */
    public akqm f72407f;

    /* renamed from: g */
    public ViewGroup f72408g;

    /* renamed from: h */
    public ViewGroup f72409h;

    /* renamed from: i */
    public ImageView f72410i;

    /* renamed from: j */
    public akqa f72411j;

    /* renamed from: k */
    protected final akpu f72412k = new akpu(this);

    /* renamed from: l */
    private CameraPreviewLayout f72413l;

    /* renamed from: m */
    private View f72414m;

    /* renamed from: n */
    private Integer f72415n;

    /* renamed from: a */
    public void mo39681a(akpn akpn) {
        akpo akpo;
        int i;
        if (getActivity() != null && !getActivity().isFinishing()) {
            akpo b = akpn.mo39668b();
            int i2 = getActivity().getResources().getConfiguration().orientation;
            if (i2 == 2) {
                akpo = b.mo39670a();
            } else if (i2 == 1) {
                akpo = b.mo39671b();
            } else {
                StringBuilder sb = new StringBuilder(38);
                sb.append(i2);
                sb.append(" is not a valid orientation");
                throw new IllegalStateException(sb.toString());
            }
            int i3 = akpo.f72392a;
            if (i3 != 0 && (i = akpo.f72393b) != 0) {
                int width = this.f72413l.getWidth();
                int round = Math.round(((float) width) / (((float) i3) / ((float) i)));
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                this.f72409h.getLocationInWindow(iArr);
                this.f72413l.getLocationInWindow(iArr2);
                int height = ((this.f72413l.getHeight() - round) / 2) + (((this.f72409h.getHeight() / 2) + iArr[1]) - ((this.f72413l.getHeight() / 2) + iArr2[1]));
                Rect rect = new Rect(0, height, width, round + height);
                CameraPreviewLayout cameraPreviewLayout = this.f72413l;
                cameraPreviewLayout.f81271a = rect;
                cameraPreviewLayout.requestLayout();
                akqm akqm = this.f72407f;
                ViewGroup viewGroup = this.f72409h;
                sdo.m34959a(viewGroup);
                CameraPreviewLayout cameraPreviewLayout2 = this.f72413l;
                int[] a = akqm.m60254a(cameraPreviewLayout2);
                int i4 = a[0];
                int i5 = cameraPreviewLayout2.f81271a.left;
                int i6 = a[1];
                int i7 = cameraPreviewLayout2.f81271a.top;
                int[] a2 = akqm.m60254a(viewGroup);
                a2[0] = a2[0] - (i4 + i5);
                int i8 = a2[1] - (i6 + i7);
                a2[1] = i8;
                int i9 = a2[0];
                RectF rectF = new RectF((float) i9, (float) i8, (float) (i9 + viewGroup.getWidth()), (float) (a2[1] + viewGroup.getHeight()));
                Rect rect2 = cameraPreviewLayout2.f81271a;
                float width2 = rectF.width();
                float height2 = rectF.height();
                float width3 = ((width2 * 1.0869565f) - rectF.width()) / 2.0f;
                float height3 = ((height2 * 1.0869565f) - rectF.height()) / 2.0f;
                rectF.left -= width3;
                rectF.top -= height3;
                rectF.right += width3;
                rectF.bottom += height3;
                rectF.left = Math.max(rectF.left, (float) rect2.left);
                rectF.top = Math.max(rectF.top, (float) rect2.top);
                rectF.right = Math.min(rectF.right, (float) rect2.right);
                rectF.bottom = Math.min(rectF.bottom, (float) rect2.bottom);
                akqm.f72454b = rectF;
                RectF rectF2 = akqm.f72454b;
                float width4 = ((float) cameraPreviewLayout2.f81271a.width()) / ((float) ((akqc) akqm.f72453a).mo6445a().mo39668b().mo39671b().f72392a);
                akqm.f72455c = new Rect(Math.round(rectF2.top / width4), Math.round(rectF2.left / width4), Math.round(rectF2.bottom / width4), Math.round(rectF2.right / width4));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bC */
    public void mo39684bC() {
        mo39683a(true);
        this.f72411j.mo39697bC();
    }

    /* access modifiers changed from: protected */
    /* renamed from: bD */
    public void mo39685bD() {
        this.f72405d.mo39783l();
        ((akqd) this.f72403b).mo6445a().mo39666b();
    }

    /* renamed from: bE */
    public final void mo39686bE() {
        this.f72412k.f72400a = false;
    }

    /* renamed from: d */
    public final void mo39687d() {
        Integer num;
        akql akql = this.f72406e;
        if (!(akql == null || (num = this.f72415n) == null)) {
            akql.mo39704a(num.intValue());
            this.f72410i.setVisibility(0);
        }
        this.f72402a.mo39719a();
    }

    /* renamed from: e */
    public final void mo39688e() {
        if (this.f72406e != null) {
            this.f72410i.setVisibility(8);
            this.f72415n = Integer.valueOf(this.f72406e.f72451m);
            this.f72406e.mo39704a(3);
        }
        this.f72402a.mo39721a(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f72402a.mo39722a(this.f72412k);
        this.f72405d.mo39758a(getActivity().getCallingActivity());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.ocr_camera_fragment, viewGroup, false);
        this.f72413l = (CameraPreviewLayout) inflate.findViewById(C0126R.C0129id.ocrPreviewContainer);
        this.f72414m = inflate.findViewById(C0126R.C0129id.ocrCurtain);
        if (getActivity() instanceof akps) {
            this.f72414m.setBackgroundColor(((akps) getActivity()).mo39678a());
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(C0126R.C0129id.ocrOverlayContainer);
        this.f72408g = viewGroup2;
        akqa akqa = this.f72411j;
        if (akqa != null) {
            this.f72409h = akqa.mo39694a(layoutInflater, viewGroup2).mo39693a();
        } else {
            this.f72409h = viewGroup2;
        }
        if (this.f72404c.mo39857g()) {
            this.f72409h.setOnClickListener(new akpp(this));
        }
        this.f72410i = (ImageView) inflate.findViewById(C0126R.C0129id.flashStateButton);
        if (this.f72404c.mo39854d() && this.f72406e != null) {
            this.f72410i.setVisibility(0);
            this.f72410i.setOnClickListener(new akpq(this));
            akpr akpr = new akpr(this, layoutInflater);
            this.f72406e.f72444f.add(akpr);
            akpr.mo39677a(this.f72406e.f72451m);
        }
        return inflate;
    }

    public void onPause() {
        this.f72413l.removeAllViews();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        SurfaceView surfaceView = new SurfaceView(getActivity());
        this.f72413l.addView(surfaceView);
        surfaceView.getHolder().addCallback(this);
        surfaceView.getHolder().setType(3);
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        akpo akpo;
        boolean z;
        if (getActivity() != null && !getActivity().isFinishing()) {
            int height = this.f72413l.getHeight();
            int width = this.f72413l.getWidth();
            int i = getActivity().getResources().getConfiguration().orientation;
            boolean z2 = false;
            if (i == 2) {
                akpo = akpo.m60217a(width, height);
            } else if (i == 1) {
                akpo = new akpo(width, height, false);
            } else {
                StringBuilder sb = new StringBuilder(38);
                sb.append(i);
                sb.append(" is not a valid orientation");
                throw new IllegalStateException(sb.toString());
            }
            akrj akrj = this.f72402a;
            akrj.m60269d();
            if (akrj.f72487c == null) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34970a(z);
            if (akrj.f72488d == null) {
                z2 = true;
            }
            sdo.m34970a(z2);
            akrj.f72487c = akqb.m60240b();
            akrj.f72487c.start();
            akrj.f72488d = new adzt(akrj.f72487c.getLooper());
            akrj.f72488d.post(new akqo(akrj, this, akpo, surfaceHolder));
            this.f72411j.mo39696b();
            akql akql = this.f72406e;
            if (akql != null) {
                akql.f72442d.registerListener(akql.f72445g, akql.f72443e, 3);
                akql.f72441c.postDelayed(akql.f72446h, 1000);
            }
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (this.f72406e != null) {
            this.f72410i.setImportantForAccessibility(2);
            akql akql = this.f72406e;
            akql.f72441c.removeCallbacks(akql.f72446h);
            akql.f72442d.unregisterListener(akql.f72445g);
            akql.mo39704a(1);
        }
        this.f72402a.mo39725b();
        this.f72402a.mo39727c();
        akrj akrj = this.f72402a;
        akrj.m60269d();
        bmza b = bmza.m108659b(bmvy.f131119a);
        int i = akrj.f72495k;
        Log.i("SimpleCameraManager", "Calling HandlerThread.quitSafely() and awaiting termination");
        akrj.f72487c.quitSafely();
        if (akrj.f72502r == 0) {
            Log.i("SimpleCameraManager", "Terminated cleanly");
        }
        try {
            akrj.f72487c.join();
            akrj.f72487c = null;
            akrj.f72488d = null;
        } catch (InterruptedException e) {
            Log.w("SimpleCameraManager", "Interrupted while awaiting background thread join", e);
        }
        new Object[1][0] = Long.valueOf(b.mo66928a(TimeUnit.MILLISECONDS));
    }

    /* renamed from: a */
    public final void mo39682a(String str) {
        Log.e("AbstractCameraFragment", str.length() == 0 ? new String("Camera setup failed: ") : "Camera setup failed: ".concat(str));
        this.f72411j.mo39698c();
    }

    /* renamed from: a */
    public final void mo39683a(boolean z) {
        int i = 0;
        this.f72414m.setVisibility(!z ? 0 : 8);
        ViewGroup viewGroup = this.f72408g;
        if (!z) {
            i = 8;
        }
        viewGroup.setVisibility(i);
    }
}
