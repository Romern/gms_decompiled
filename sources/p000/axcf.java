package p000;

import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.p088ui.component.table.RowClickFrameLayout;
import com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: axcf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axcf extends bkdx {

    /* renamed from: a */
    axci f95756a;

    /* renamed from: b */
    RecyclerView f95757b;

    /* renamed from: c */
    axcj f95758c;

    /* renamed from: d */
    RowClickFrameLayout f95759d;

    /* renamed from: e */
    private final bjes f95760e = new bjes(28);

    /* renamed from: f */
    private String f95761f;

    /* renamed from: W */
    public final long mo52837W() {
        mo65884y();
        return ((bwin) this.f124069w).f159655b;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_table, viewGroup, false);
        this.f95757b = (RecyclerView) inflate.findViewById(C0126R.C0129id.table);
        this.f95759d = (RowClickFrameLayout) inflate.findViewById(C0126R.C0129id.row_click_frame_layout);
        this.f95757b.setVisibility(8);
        this.f95757b.setNestedScrollingEnabled(false);
        return inflate;
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        return false;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        return true;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return Collections.emptyList();
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return new ArrayList();
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f95760e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        boolean z = this.f124195aJ;
        RecyclerView recyclerView = this.f95757b;
        if (recyclerView != null) {
            recyclerView.setEnabled(z);
            this.f95759d.setEnabled(z);
            axcj axcj = this.f95758c;
            if (axcj != null) {
                RecyclerView recyclerView2 = this.f95757b;
                axcj.f95773g = z;
                int childCount = recyclerView2.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    ((axca) recyclerView2.getChildViewHolder(recyclerView2.getChildAt(i))).mo53002a(axcj.f95770d, axcj.f95773g);
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f95761f = getArguments().getString("analyticsId");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
     arg types: [int, android.util.TypedValue, int]
     candidates:
      ClspMth{android.content.res.Resources.getValue(java.lang.String, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
      ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException} */
    public final void onResume() {
        List list;
        int i;
        int i2;
        if (((bwin) this.f124069w).f159654a.size() > 0 && this.f95757b.getAdapter() == null) {
            this.f95757b.setVisibility(0);
            this.f95756a = new axci((bwin) this.f124069w);
            axci axci = this.f95756a;
            bkgd al = super.mo52879al();
            al.f124191f = this.f95761f;
            axcj axcj = new axcj(axci, al);
            this.f95758c = axcj;
            axcj.f95770d.f124186a = this.f124196aK;
            bwij bwij = (bwij) ((bwin) this.f124069w).f159654a.get(0);
            int size = bwij.f159640b.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                i3 += axck.m82310a((bwig) bwij.f159640b.get(i4));
            }
            SpannedGridLayoutManager spannedGridLayoutManager = new SpannedGridLayoutManager(new axcg(this.f95756a), i3);
            List bxvv = new bxvv(((bwin) this.f124069w).f159656c, bwin.f159651d);
            if (bxvv.isEmpty()) {
                list = Collections.nCopies(i3, bwim.MEDIUM);
            } else if (bxvv.size() == i3) {
                list = bxvv;
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "Table %d has mis-matched columns and hints. %d columns but %d hints.", Long.valueOf(((bwin) this.f124069w).f159655b), Integer.valueOf(i3), Integer.valueOf(bxvv.size())));
            }
            float[] fArr = new float[i3];
            int[] iArr = new int[i3];
            for (int i5 = 0; i5 < i3; i5++) {
                bwim bwim = bwim.UNKNOWN;
                int ordinal = ((bwim) list.get(i5)).ordinal();
                if (ordinal != 1) {
                    i = ordinal != 3 ? C0126R.dimen.wallet_table_medium_column_weight : C0126R.dimen.wallet_table_large_column_weight;
                } else {
                    i = C0126R.dimen.wallet_table_small_column_weight;
                }
                TypedValue typedValue = new TypedValue();
                getResources().getValue(i, typedValue, true);
                fArr[i5] = typedValue.getFloat();
                int ordinal2 = ((bwim) list.get(i5)).ordinal();
                if (ordinal2 != 1) {
                    i2 = ordinal2 != 3 ? C0126R.dimen.wallet_table_medium_column_min_size : C0126R.dimen.wallet_table_large_column_min_size;
                } else {
                    i2 = C0126R.dimen.wallet_table_small_column_min_size;
                }
                iArr[i5] = getResources().getDimensionPixelSize(i2);
            }
            spannedGridLayoutManager.f151570b = new bjca(i3, fArr, iArr);
            spannedGridLayoutManager.mo247r();
            RowClickFrameLayout rowClickFrameLayout = this.f95759d;
            rowClickFrameLayout.f110590d = this.f95756a;
            rowClickFrameLayout.f110589c = this.f95758c;
            this.f95757b.addOnItemTouchListener(rowClickFrameLayout);
            this.f95757b.addItemDecoration(new axce(this.f95756a, this.f123962aG));
            this.f95757b.setLayoutManager(spannedGridLayoutManager);
            this.f95757b.setAdapter(this.f95758c);
            mo51922f();
        }
        super.onResume();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bwin.f159652e.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        return null;
    }
}
