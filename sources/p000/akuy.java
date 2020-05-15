package p000;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ocr.base.OcrImage;
import com.google.android.gms.ocr.base.Quadrilateral;
import com.google.android.gms.ocr.processors.CardDetector;
import com.google.android.gms.ocr.processors.CardRectifier;
import com.google.android.gms.ocr.processors.StrictCardDetector;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: akuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akuy extends akuu {

    /* renamed from: a */
    public final aksc f72927a;

    /* renamed from: b */
    public final Handler f72928b;

    /* renamed from: c */
    public final CardDetector.Options f72929c;

    /* renamed from: d */
    public akvb f72930d;

    /* renamed from: e */
    public akva f72931e;

    /* renamed from: f */
    private final akug f72932f;

    /* renamed from: g */
    private final ExecutorService f72933g;

    /* renamed from: h */
    private final StrictCardDetector f72934h;

    /* renamed from: i */
    private final CardDetector f72935i;

    /* renamed from: j */
    private final CardRectifier f72936j;

    /* renamed from: k */
    private final cijl f72937k;

    /* renamed from: l */
    private final boolean f72938l;

    public akuy(akug akug, StrictCardDetector strictCardDetector, CardDetector cardDetector, CardRectifier cardRectifier, cijl cijl, aksc aksc, boolean z) {
        ExecutorService executorService;
        this.f72932f = akug;
        if (akug.mo39853c()) {
            executorService = akui.m60498a();
        } else {
            executorService = null;
        }
        this.f72933g = executorService;
        this.f72934h = strictCardDetector;
        this.f72935i = cardDetector;
        this.f72936j = cardRectifier;
        this.f72937k = cijl;
        this.f72927a = aksc;
        this.f72938l = z;
        this.f72928b = new adzt(Looper.getMainLooper());
        if (akug.mo39853c()) {
            aktz m = akug.mo39863m();
            CardDetector.Options options = new CardDetector.Options();
            akua akua = m.f72802a;
            options.areaToleranceFactor = (float) akua.f72832n;
            options.cameraHorizontalFov = (float) akua.f72833o;
            options.cornerAngleTolerance = (float) akua.f72834p;
            options.cornerOutsideImageTolerance = (float) akua.f72835q;
            options.maxDistance = (float) akua.f72836r;
            options.maxGeometricError = (float) akua.f72837s;
            options.maxSlant = (float) akua.f72838t;
            options.maxTiltDeviation = (float) akua.f72839u;
            options.minPerimeterCoverageFraction = (float) akua.f72840v;
            options.areaDeviationWeight = (float) akua.f72841w;
            options.cornerAngleDeviationWeight = (float) akua.f72842x;
            options.aspectRatioDeviationWeight = (float) akua.f72843y;
            options.perimeterCoverageWeight = (float) akua.f72844z;
            this.f72929c = options;
            return;
        }
        this.f72929c = null;
    }

    /* renamed from: a */
    private static Quadrilateral m60524a(Future future) {
        try {
            return (Quadrilateral) future.get(500, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            return null;
        } catch (ExecutionException e2) {
            Log.e("CardRectifyProcessor", "Caught exception getting tolerant card detector result", e2);
            return null;
        } catch (TimeoutException e3) {
            Log.e("CardRectifyProcessor", "Timed out getting tolerant card detector result", e3);
            return null;
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Pair mo39835b(Object obj) {
        Future future;
        float f;
        Pair pair;
        float f2;
        akvf akvf = (akvf) obj;
        OcrImage d = akvf.mo39889d();
        Rect b = ((akqm) this.f72937k).mo6445a();
        if (d.getOrientation() % 180 == 90) {
            b.set(d.getHeight() - b.bottom, b.left, d.getHeight() - b.top, b.right);
        }
        if (!this.f72932f.mo39853c() || !this.f72932f.mo39853c()) {
            future = null;
        } else {
            CardDetector.Options options = this.f72929c;
            sdo.m34959a(options);
            CardDetector cardDetector = this.f72935i;
            sdo.m34959a(cardDetector);
            ExecutorService executorService = this.f72933g;
            sdo.m34959a(executorService);
            future = executorService.submit(new akuv(this, b, cardDetector, d, options));
        }
        bmza b2 = bmza.m108659b(bmvy.f131119a);
        StrictCardDetector strictCardDetector = this.f72934h;
        int width = d.getWidth();
        if (width < 960) {
            f = width >= 640 ? 0.63750005f - ((((float) (width - 640)) * 0.22299999f) / 320.0f) : 0.63750005f;
        } else {
            f = 0.527f;
        }
        StringBuilder sb = new StringBuilder(58);
        sb.append("Min radon std dev is ");
        sb.append(f);
        sb.append(" for width ");
        sb.append(width);
        sb.toString();
        int orientation = d.getOrientation();
        strictCardDetector.f81340a.mo39895a();
        StrictCardDetector.Result nativeDetect = strictCardDetector.nativeDetect(d, b, 0.08f, f, orientation);
        this.f72927a.mo39778h(b2.mo66928a(TimeUnit.MILLISECONDS));
        this.f72928b.post(new akuw(this, nativeDetect.f81341a));
        Quadrilateral quadrilateral = nativeDetect.f81342b;
        boolean z = false;
        if (this.f72932f.mo39853c()) {
            sdo.m34959a(future);
            Quadrilateral a = m60524a(future);
            if (quadrilateral == null) {
                this.f72927a.mo39786o();
                pair = new Pair(a, false);
            } else {
                this.f72927a.mo39784m();
                pair = new Pair(quadrilateral, true);
            }
        } else {
            pair = new Pair(quadrilateral, true);
        }
        Quadrilateral quadrilateral2 = (Quadrilateral) pair.first;
        boolean booleanValue = ((Boolean) pair.second).booleanValue();
        CardRectifier.Result result = CardRectifier.f81333a;
        if (quadrilateral2 != null) {
            CardRectifier cardRectifier = this.f72936j;
            boolean z2 = this.f72938l;
            if (this.f72932f.mo39858h()) {
                f2 = this.f72932f.mo39859i();
            } else {
                f2 = -1.0f;
            }
            float j = this.f72932f.mo39860j();
            cardRectifier.f81334b.mo39895a();
            result = cardRectifier.nativeRectify(d, quadrilateral2, z2, f2, j);
            if (this.f72932f.mo39858h() && result.f81339e) {
                if (!booleanValue) {
                    this.f72927a.mo39788q();
                } else {
                    this.f72927a.mo39787p();
                }
            }
        }
        akvf.mo39887a(result);
        if (result.f81335a != null) {
            z = true;
        }
        return new Pair(Boolean.valueOf(z), akvf);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo39836c(Object obj) {
        ((akvf) obj).mo39887a((CardRectifier.Result) null);
    }

    /* renamed from: d */
    public final void mo39873d() {
        if (this.f72932f.mo39853c()) {
            ExecutorService executorService = this.f72933g;
            sdo.m34959a(executorService);
            executorService.shutdown();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39833a() {
        this.f72927a.mo39766c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39834a(long j) {
        this.f72927a.mo39764b(j);
    }
}
