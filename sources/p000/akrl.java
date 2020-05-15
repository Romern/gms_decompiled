package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.TypedValue;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.ocr.base.OcrImage;
import com.google.android.gms.ocr.cardcapture.CardCaptureChimeraActivity;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* renamed from: akrl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akrl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f72505a;

    /* renamed from: b */
    final /* synthetic */ CardCaptureChimeraActivity f72506b;

    public akrl(CardCaptureChimeraActivity cardCaptureChimeraActivity, List list) {
        this.f72506b = cardCaptureChimeraActivity;
        this.f72505a = list;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
     arg types: [?, android.util.TypedValue, int]
     candidates:
      ClspMth{android.content.res.Resources.getValue(java.lang.String, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
      ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.Bitmap.createBitmap(android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, boolean):android.graphics.Bitmap}
     arg types: [android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, int]
     candidates:
      ClspMth{android.graphics.Bitmap.createBitmap(android.util.DisplayMetrics, int[], int, int, int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap}
      ClspMth{android.graphics.Bitmap.createBitmap(android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, boolean):android.graphics.Bitmap} */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e2 A[Catch:{ all -> 0x0105 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e8 A[Catch:{ all -> 0x0105 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f6 A[SYNTHETIC, Splitter:B:37:0x00f6] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0108 A[SYNTHETIC, Splitter:B:45:0x0108] */
    public final void run() {
        Bitmap bitmap;
        CardCaptureChimeraActivity cardCaptureChimeraActivity = this.f72506b;
        List list = this.f72505a;
        if (list != null && !list.isEmpty()) {
            OutputStream outputStream = null;
            try {
                outputStream = cardCaptureChimeraActivity.getContentResolver().openOutputStream(cardCaptureChimeraActivity.f81274d, "w");
                try {
                    OcrImage ocrImage = (OcrImage) list.get(0);
                    int format = ocrImage.getFormat();
                    if (format == 0) {
                        bitmap = akvi.m60556a(ocrImage.getData());
                    } else if (format == 256) {
                        byte[] data = ocrImage.getData();
                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(data, 0, data.length);
                        Matrix matrix = new Matrix();
                        matrix.postRotate((float) ocrImage.getOrientation());
                        int height = decodeByteArray.getHeight();
                        int width = decodeByteArray.getWidth();
                        TypedValue typedValue = new TypedValue();
                        cardCaptureChimeraActivity.getResources().getValue((int) C0126R.dimen.ocr_iso_iec_7810_card_aspect_ratio, typedValue, true);
                        float f = typedValue.getFloat();
                        if (ocrImage.getOrientation() % 180 == 0) {
                            int min = (int) Math.min((float) height, ((float) width) / f);
                            bitmap = Bitmap.createBitmap(decodeByteArray, 0, (height - min) / 2, width, min, matrix, true);
                        } else {
                            int min2 = (int) Math.min((float) width, ((float) height) / f);
                            bitmap = Bitmap.createBitmap(decodeByteArray, (width - min2) / 2, 0, min2, height, matrix, true);
                        }
                    } else {
                        int format2 = ocrImage.getFormat();
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("Unsupported format: ");
                        sb.append(format2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 90, outputStream);
                    cardCaptureChimeraActivity.setResult(-1);
                    if (outputStream != null) {
                        try {
                            outputStream.flush();
                            outputStream.close();
                        } catch (IOException e) {
                            e = e;
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    try {
                        String valueOf = String.valueOf(cardCaptureChimeraActivity.f81274d.getPath());
                        akvj.m60557a("CardCaptureChimeraActivity", e, valueOf.length() != 0 ? new String("Could not write to file: ") : "Could not write to file: ".concat(valueOf));
                        cardCaptureChimeraActivity.setResult(10010);
                        if (outputStream != null) {
                        }
                        cardCaptureChimeraActivity.finish();
                    } catch (Throwable th) {
                        th = th;
                        if (outputStream != null) {
                            try {
                                outputStream.flush();
                                outputStream.close();
                            } catch (IOException e3) {
                                akvj.m60557a("CardCaptureChimeraActivity", e3, "Caught exception trying to close");
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (outputStream != null) {
                    }
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                String valueOf2 = String.valueOf(cardCaptureChimeraActivity.f81274d.getPath());
                akvj.m60557a("CardCaptureChimeraActivity", e, valueOf2.length() != 0 ? new String("Could not write to file: ") : "Could not write to file: ".concat(valueOf2));
                cardCaptureChimeraActivity.setResult(10010);
                if (outputStream != null) {
                    try {
                        outputStream.flush();
                        outputStream.close();
                    } catch (IOException e5) {
                        e = e5;
                    }
                }
                cardCaptureChimeraActivity.finish();
            } catch (Throwable th3) {
                th = th3;
                if (outputStream != null) {
                }
                throw th;
            }
            cardCaptureChimeraActivity.finish();
        }
        return;
        akvj.m60557a("CardCaptureChimeraActivity", e, "Caught exception trying to close");
        cardCaptureChimeraActivity.finish();
    }
}
