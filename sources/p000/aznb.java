package p000;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import com.google.android.chimera.Activity;
import java.util.Map;

/* renamed from: aznb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aznb extends CursorAdapter implements aznj, azci {

    /* renamed from: a */
    public boolean f99692a = false;

    /* renamed from: b */
    public aznx f99693b;

    static {
        bmxr.m108544a(", ");
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [android.content.Context, azmy, com.google.android.chimera.Activity], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    public aznb(Activity r10, aznz aznz, azcb azcb, Map map) {
        super((Context) r10, (Cursor) null, 0);
        this.f99693b = new aznx(r10, azcb, r10, map, this, aznz);
    }

    /* renamed from: a */
    public static synchronized aznb m85854a(Activity activity, aznz aznz, azcb azcb, Map map, String str) {
        aznb aznb;
        synchronized (aznb.class) {
            aznb = new aznb(activity, aznz, azcb, map);
        }
        return aznb;
    }

    /* renamed from: a */
    public final void mo54624a() {
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public final String mo55082b() {
        return this.f99693b.f99764g.f99688d;
    }

    public final void bindView(View view, Context context, Cursor cursor) {
        this.f99693b.mo55102a(cursor).mo55089a(view, cursor);
    }

    public final int getItemViewType(int i) {
        return aznx.m85878b((Cursor) getItem(i));
    }

    public final int getViewTypeCount() {
        return 5;
    }

    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f99693b.mo55102a(cursor).mo55095a(viewGroup, cursor);
    }

    public final Cursor swapCursor(Cursor cursor) {
        Cursor swapCursor = super.swapCursor(cursor);
        this.f99693b.f99765h.evictAll();
        return swapCursor;
    }
}
