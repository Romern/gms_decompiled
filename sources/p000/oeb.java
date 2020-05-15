package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: oeb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oeb {

    /* renamed from: a */
    final Map f37333a = new HashMap();

    /* renamed from: b */
    final /* synthetic */ oec f37334b;

    public oeb(oec oec) {
        this.f37334b = oec;
    }

    /* renamed from: a */
    public final byte[] mo22041a(String str, boolean z) {
        String str2 = !z ? "_normal" : "_flipped";
        String str3 = str2.length() == 0 ? new String(str) : str.concat(str2);
        if (this.f37333a.containsKey(str3)) {
            return (byte[]) this.f37333a.get(str3);
        }
        Drawable a = C1583oob.m29297a(this.f37334b.f37338c, str);
        if (a == null) {
            return null;
        }
        oec oec = this.f37334b;
        Bitmap createBitmap = Bitmap.createBitmap(oec.f37340e, oec.f37341f, oec.f37342g);
        Canvas canvas = new Canvas(createBitmap);
        a.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        if (z) {
            Rect bounds = a.getBounds();
            canvas.save();
            canvas.scale(-1.0f, 1.0f, bounds.exactCenterX(), bounds.exactCenterY());
            a.draw(canvas);
            canvas.restore();
        } else {
            a.draw(canvas);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f37333a.put(str3, byteArray);
        return byteArray;
    }
}
