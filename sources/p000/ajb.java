package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: ajb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajb extends aja {

    /* renamed from: a */
    protected int[] f634a;

    /* renamed from: j */
    protected final int[] f635j;

    /* renamed from: k */
    final String[] f636k;

    /* renamed from: l */
    private final int f637l = -1;

    public ajb(Context context, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, cursor);
        this.f635j = iArr;
        this.f636k = strArr;
        m855a(cursor, strArr);
    }

    /* renamed from: a */
    private final void m855a(Cursor cursor, String[] strArr) {
        if (cursor != null) {
            int length = strArr.length;
            int[] iArr = this.f634a;
            if (iArr == null || iArr.length != length) {
                this.f634a = new int[length];
            }
            for (int i = 0; i < length; i++) {
                this.f634a[i] = cursor.getColumnIndexOrThrow(strArr[i]);
            }
            return;
        }
        this.f634a = null;
    }

    /* renamed from: b */
    public final CharSequence mo433b(Cursor cursor) {
        if (this.f637l >= 0) {
            return cursor.getString(0);
        }
        return super.mo433b(cursor);
    }

    /* renamed from: c */
    public final Cursor mo804c(Cursor cursor) {
        m855a(cursor, this.f636k);
        return super.mo804c(cursor);
    }

    /* renamed from: a */
    public final void mo432a(View view, Context context, Cursor cursor) {
        int[] iArr = this.f635j;
        int length = iArr.length;
        int[] iArr2 = this.f634a;
        for (int i = 0; i < length; i++) {
            View findViewById = view.findViewById(iArr[i]);
            if (findViewById != null) {
                String string = cursor.getString(iArr2[i]);
                if (string == null) {
                    string = "";
                }
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(string);
                } else if (findViewById instanceof ImageView) {
                    ImageView imageView = (ImageView) findViewById;
                    try {
                        imageView.setImageResource(Integer.parseInt(string));
                    } catch (NumberFormatException e) {
                        imageView.setImageURI(Uri.parse(string));
                    }
                } else {
                    throw new IllegalStateException(findViewById.getClass().getName() + " is not a  view that can be bounds by this SimpleCursorAdapter");
                }
            }
        }
    }
}
