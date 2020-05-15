package p000;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;

/* renamed from: cbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cbc extends Format {
    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        stringBuffer.append(String.valueOf(obj));
        return stringBuffer;
    }

    public final Object parseObject(String str, ParsePosition parsePosition) {
        return null;
    }
}
