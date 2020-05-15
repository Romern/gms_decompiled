package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* renamed from: aix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aix extends BaseAdapter implements Filterable, aiy {

    /* renamed from: b */
    protected boolean f622b;

    /* renamed from: c */
    protected boolean f623c;

    /* renamed from: d */
    public Cursor f624d;

    /* renamed from: e */
    protected Context f625e;

    /* renamed from: f */
    protected int f626f;

    /* renamed from: g */
    protected aiv f627g;

    /* renamed from: h */
    protected DataSetObserver f628h;

    /* renamed from: i */
    protected aiz f629i;

    public aix(Context context, Cursor cursor) {
        mo802a(context, cursor, 0);
    }

    /* renamed from: a */
    public final Cursor mo801a() {
        return this.f624d;
    }

    /* renamed from: a */
    public Cursor mo429a(CharSequence charSequence) {
        return this.f624d;
    }

    /* renamed from: a */
    public abstract View mo430a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: a */
    public abstract void mo432a(View view, Context context, Cursor cursor);

    /* renamed from: b */
    public View mo803b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return mo430a(context, cursor, viewGroup);
    }

    /* renamed from: c */
    public Cursor mo804c(Cursor cursor) {
        Cursor cursor2 = this.f624d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            aiv aiv = this.f627g;
            if (aiv != null) {
                cursor2.unregisterContentObserver(aiv);
            }
            DataSetObserver dataSetObserver = this.f628h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f624d = cursor;
        if (cursor == null) {
            this.f626f = -1;
            this.f622b = false;
            notifyDataSetInvalidated();
        } else {
            aiv aiv2 = this.f627g;
            if (aiv2 != null) {
                cursor.registerContentObserver(aiv2);
            }
            DataSetObserver dataSetObserver2 = this.f628h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f626f = cursor.getColumnIndexOrThrow("_id");
            this.f622b = true;
            notifyDataSetChanged();
        }
        return cursor2;
    }

    public final int getCount() {
        Cursor cursor;
        if (!this.f622b || (cursor = this.f624d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f622b) {
            return null;
        }
        this.f624d.moveToPosition(i);
        if (view == null) {
            view = mo803b(this.f625e, this.f624d, viewGroup);
        }
        mo432a(view, this.f625e, this.f624d);
        return view;
    }

    public final Filter getFilter() {
        if (this.f629i == null) {
            this.f629i = new aiz(this);
        }
        return this.f629i;
    }

    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f622b || (cursor = this.f624d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f624d;
    }

    public final long getItemId(int i) {
        Cursor cursor;
        if (!this.f622b || (cursor = this.f624d) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f624d.getLong(this.f626f);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f622b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f624d.moveToPosition(i)) {
            if (view == null) {
                view = mo430a(this.f625e, this.f624d, viewGroup);
            }
            mo432a(view, this.f625e, this.f624d);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    public boolean hasStableIds() {
        return true;
    }

    public aix(Context context, boolean z) {
        mo802a(context, (Cursor) null, !z ? 2 : 1);
    }

    /* renamed from: b */
    public CharSequence mo433b(Cursor cursor) {
        return cursor != null ? cursor.toString() : "";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo802a(Context context, Cursor cursor, int i) {
        int i2;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f623c = true;
        } else {
            this.f623c = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f624d = cursor;
        this.f622b = z;
        this.f625e = context;
        if (z) {
            i2 = cursor.getColumnIndexOrThrow("_id");
        } else {
            i2 = -1;
        }
        this.f626f = i2;
        if ((i & 2) == 2) {
            this.f627g = new aiv(this);
            this.f628h = new aiw(this);
        } else {
            this.f627g = null;
            this.f628h = null;
        }
        if (z) {
            aiv aiv = this.f627g;
            if (aiv != null) {
                cursor.registerContentObserver(aiv);
            }
            DataSetObserver dataSetObserver = this.f628h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: a */
    public void mo431a(Cursor cursor) {
        Cursor c = mo804c(cursor);
        if (c != null) {
            c.close();
        }
    }
}
