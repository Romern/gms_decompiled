package p000;

import android.content.ContentValues;
import java.util.Comparator;

/* renamed from: ansf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ansf implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((ContentValues) obj).getAsString("display_name").compareTo(((ContentValues) obj2).getAsString("display_name"));
    }
}
