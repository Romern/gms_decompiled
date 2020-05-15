package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.io.File;
import java.io.IOException;

/* renamed from: ajwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajwv extends Drawable {

    /* renamed from: a */
    private static final int[][] f71468a = {new int[]{-20054, -2407369}, new int[]{-17711, -1499549}, new int[]{-671745, -6543440}, new int[]{-2044161, -10011977}, new int[]{-5063169, -12627531}, new int[]{-4199937, -16540699}, new int[]{-4730113, -12417548}, new int[]{-3868161, -16738393}, new int[]{-2883590, -16738680}, new int[]{-3342362, -15753896}, new int[]{-2424902, -9920712}, new int[]{-9798, -1086464}, new int[]{-12609, -43230}};

    /* renamed from: b */
    private final Context f71469b;

    /* renamed from: c */
    private final Paint f71470c;

    /* renamed from: d */
    private final int f71471d;

    /* renamed from: e */
    private final int f71472e;

    /* renamed from: f */
    private final int f71473f;

    /* renamed from: g */
    private final ajwu f71474g;

    /* renamed from: h */
    private Bitmap f71475h;

    /* renamed from: i */
    private final int f71476i;

    /* renamed from: j */
    private final int f71477j;

    public ajwv(Context context, ajwu ajwu, int i) {
        this.f71469b = context;
        this.f71474g = ajwu;
        Paint paint = new Paint(1);
        this.f71470c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f71470c.setFilterBitmap(true);
        this.f71471d = akim.m59828a(context, i);
        double d = (double) i;
        Double.isNaN(d);
        this.f71472e = akim.m59828a(context, (int) (d / 1.5d));
        Double.isNaN(d);
        this.f71473f = akim.m59828a(context, (int) (d / 2.6d));
        if (!ajwu.f71467c) {
            this.f71476i = context.getColor(C0126R.color.sharing_drawable_unknown);
            this.f71477j = context.getColor(C0126R.color.sharing_drawable_unknown_dark);
            return;
        }
        int[][] iArr = f71468a;
        this.f71476i = iArr[m59159a(ajwu, iArr.length)][0];
        int[][] iArr2 = f71468a;
        this.f71477j = iArr2[m59159a(ajwu, iArr2.length)][1];
    }

    /* renamed from: a */
    private static int m59159a(ajwu ajwu, int i) {
        return Math.abs(ajwu.f71465a.hashCode()) % i;
    }

    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        String lastPathSegment;
        if (this.f71475h == null) {
            ajwu ajwu = this.f71474g;
            int i = this.f71471d;
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            Uri uri = ajwu.f71466b;
            Bitmap bitmap2 = null;
            if (uri != null) {
                Context context = this.f71469b;
                if (uri.toString().startsWith("file")) {
                    String path = uri.getPath();
                    bitmap = !TextUtils.isEmpty(path) ? BitmapFactory.decodeFile(path) : null;
                } else if (uri.toString().startsWith("content")) {
                    try {
                        bitmap = MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri);
                    } catch (IOException e) {
                        bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                        bnsl.mo68437a(e);
                        bnsl.mo68432a("akia", "a", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68420a("Failed to get bitmap from %s", uri);
                        bitmap = null;
                    }
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    int i2 = this.f71471d;
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i2, false);
                    bitmap2 = Bitmap.createBitmap(createScaledBitmap.getWidth(), createScaledBitmap.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas3 = new Canvas(bitmap2);
                    Paint paint = new Paint();
                    Rect rect = new Rect(0, 0, createScaledBitmap.getWidth(), createScaledBitmap.getHeight());
                    paint.setAntiAlias(true);
                    paint.setFilterBitmap(true);
                    canvas3.drawARGB(0, 0, 0, 0);
                    canvas3.drawCircle((float) (createScaledBitmap.getWidth() / 2), (float) (createScaledBitmap.getHeight() / 2), (float) (createScaledBitmap.getWidth() / 2), paint);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    canvas3.drawBitmap(createScaledBitmap, rect, rect, paint);
                } else {
                    Context context2 = this.f71469b;
                    if (akif.m59813c(uri.toString()) && "com.google.android.gms.fileprovider".equals(uri.getAuthority()) && (lastPathSegment = uri.getLastPathSegment()) != null) {
                        File file = new File(akis.m59847a(context2), lastPathSegment);
                        if (file.exists() && file.delete()) {
                            srn srn = ajvp.f71371a;
                        }
                    }
                    srn srn2 = ajvp.f71371a;
                }
            }
            if (!ajwu.f71467c) {
                m59161a(canvas2);
                aux a = aux.m2149a(this.f71469b.getResources(), C0126R.C0127drawable.quantum_ic_phone_android_vd_theme_24, this.f71469b.getTheme());
                int i3 = this.f71472e;
                a.setBounds(0, 0, i3, i3);
                a.setTint(this.f71477j);
                float f = (float) ((this.f71471d / 2) - (this.f71472e / 2));
                canvas2.drawBitmap(akia.m59783b(a), f, f, this.f71470c);
            } else if (bitmap2 == null) {
                m59161a(canvas2);
                String str = ajwu.f71465a;
                StringBuilder sb = new StringBuilder();
                sb.appendCodePoint(str.codePointAt(str.offsetByCodePoints(0, 0)));
                String sb2 = sb.toString();
                this.f71470c.setColor(this.f71477j);
                this.f71470c.setTextSize((float) this.f71473f);
                this.f71470c.setTextAlign(Paint.Align.CENTER);
                int i4 = this.f71471d;
                canvas2.drawText(sb2, (float) (i4 / 2), (float) ((int) (((((float) i4) - this.f71470c.descent()) - this.f71470c.ascent()) / 2.0f)), this.f71470c);
            } else {
                this.f71470c.setColor(-1);
                canvas2.drawBitmap(bitmap2, 0.0f, 0.0f, this.f71470c);
            }
            this.f71475h = createBitmap;
        }
        canvas.drawBitmap(this.f71475h, 0.0f, 0.0f, this.f71470c);
    }

    public final int getAlpha() {
        return this.f71470c.getAlpha();
    }

    public final ColorFilter getColorFilter() {
        return this.f71470c.getColorFilter();
    }

    public final int getIntrinsicHeight() {
        return this.f71471d;
    }

    public final int getIntrinsicWidth() {
        return this.f71471d;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.f71470c.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f71470c.setColorFilter(colorFilter);
    }

    /* renamed from: a */
    public static int m59160a(Context context) {
        return (int) context.getResources().getDimension(C0126R.dimen.sharing_share_target_profile_drawable_size);
    }

    /* renamed from: a */
    private final void m59161a(Canvas canvas) {
        this.f71470c.setColor(this.f71476i);
        float f = (float) (this.f71471d / 2);
        canvas.drawCircle(f, f, f, this.f71470c);
    }

    public ajwv(Context context, ShareTarget shareTarget) {
        this(context, new ajwu(shareTarget.f81029b, shareTarget.f81030c, shareTarget.f81038k), m59160a(context));
    }
}
