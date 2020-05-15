package p000;

import android.content.res.Resources;
import android.database.DataSetObserver;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* renamed from: yg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1511yg implements ListAdapter, SpinnerAdapter {

    /* renamed from: a */
    private final SpinnerAdapter f27644a;

    /* renamed from: b */
    private ListAdapter f27645b;

    public C1511yg(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
        this.f27644a = spinnerAdapter;
        if (spinnerAdapter instanceof ListAdapter) {
            this.f27645b = (ListAdapter) spinnerAdapter;
        }
        if (theme != null) {
            int i = Build.VERSION.SDK_INT;
            if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof adn) {
                adn adn = (adn) spinnerAdapter;
                if (adn.mo442a() == null) {
                    adn.mo443b();
                }
            }
        }
    }

    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.f27645b;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    public final int getCount() {
        SpinnerAdapter spinnerAdapter = this.f27644a;
        if (spinnerAdapter != null) {
            return spinnerAdapter.getCount();
        }
        return 0;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        SpinnerAdapter spinnerAdapter = this.f27644a;
        if (spinnerAdapter != null) {
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }
        return null;
    }

    public final Object getItem(int i) {
        SpinnerAdapter spinnerAdapter = this.f27644a;
        if (spinnerAdapter != null) {
            return spinnerAdapter.getItem(i);
        }
        return null;
    }

    public final long getItemId(int i) {
        SpinnerAdapter spinnerAdapter = this.f27644a;
        if (spinnerAdapter != null) {
            return spinnerAdapter.getItemId(i);
        }
        return -1;
    }

    public final int getItemViewType(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return getDropDownView(i, view, viewGroup);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final boolean hasStableIds() {
        SpinnerAdapter spinnerAdapter = this.f27644a;
        return spinnerAdapter != null && spinnerAdapter.hasStableIds();
    }

    public final boolean isEmpty() {
        return getCount() == 0;
    }

    public final boolean isEnabled(int i) {
        ListAdapter listAdapter = this.f27645b;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i);
        }
        return true;
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f27644a;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f27644a;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
