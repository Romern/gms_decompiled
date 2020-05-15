package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;

/* renamed from: bdcj */
public final /* synthetic */ class bdcj implements bdeq {

    /* renamed from: a */
    private final bddc f105330a;

    public bdcj(bddc bddc) {
        this.f105330a = bddc;
    }

    /* renamed from: a */
    public final void mo12344a(Object obj, int i, bdep bdep) {
        bddc bddc = this.f105330a;
        bmxy.m108588a(true);
        if (i == 0) {
            i = 120;
        }
        CharSequence c = bddc.f105354a.mo12346c(obj);
        CharSequence b = bddc.f105354a.mo12345b(obj);
        ArrayList arrayList = new ArrayList();
        if (c != null) {
            arrayList.add(c.toString());
        }
        if (b != null) {
            arrayList.add(b.toString());
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        bdcq bdcq = bddc.f105355b;
        bepz bepz = new bepz(new beqf(bdcq.f105339a.getApplicationContext(), bqgs.m112811a(bdcq.f105340b)));
        int[] iArr = beqa.f112026a;
        bepy bepy = new bepy(new beqb(bepz));
        bepy.f112023d = beqb.m95431a(bddc.f105354a.mo12343a(obj));
        bepy.f112022c = bepy.f112024e.mo60925a(new bddb(strArr));
        Canvas canvas = new Canvas(createBitmap);
        int height = createBitmap.getHeight();
        int width = createBitmap.getWidth();
        float min = (float) Math.min(height, width);
        Paint paint = (Paint) bepy.f112020a.mo58597a();
        synchronized (bepy.f112020a) {
            paint.setColor(bepy.f112023d);
            float f = (float) (width / 2);
            float f2 = (float) (height / 2);
            canvas.drawCircle(f, f2, min / 2.0f, paint);
            if (bepy.f112022c != null) {
                paint.setColor(-1);
                paint.setTextSize(min * 0.47f);
                paint.getTextBounds(bepy.f112022c.toString(), 0, bepy.f112022c.length(), bepy.f112021b);
                CharSequence charSequence = bepy.f112022c;
                canvas.drawText(charSequence, 0, charSequence.length(), f, f2 - bepy.f112021b.exactCenterY(), paint);
            }
        }
        bdep.mo57931a(createBitmap);
    }
}
