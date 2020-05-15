package p000;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import com.google.android.gms.location.places.internal.AutocompletePredictionEntity;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: aemu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aemu {
    /* renamed from: a */
    public static CharSequence m52173a(String str, List list, CharacterStyle characterStyle) {
        if (characterStyle == null) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AutocompletePredictionEntity.SubstringEntity substringEntity = (AutocompletePredictionEntity.SubstringEntity) it.next();
            CharacterStyle wrap = CharacterStyle.wrap(characterStyle);
            int i = substringEntity.f79525a;
            spannableString.setSpan(wrap, i, substringEntity.f79526b + i, 0);
        }
        return spannableString;
    }

    /* renamed from: a */
    public static String m52174a(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        return TextUtils.join(", ", collection);
    }
}
