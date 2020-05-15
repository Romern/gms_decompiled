package p000;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.WalletCheckedTextView;
import java.util.List;

/* renamed from: bkfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bkfz extends ArrayAdapter {

    /* renamed from: d */
    public static final /* synthetic */ int f124177d = 0;

    /* renamed from: a */
    public String f124178a;

    /* renamed from: b */
    protected View f124179b;

    /* renamed from: c */
    public int[] f124180c;

    /* renamed from: e */
    private View.AccessibilityDelegate f124181e;

    public bkfz(Context context, List list) {
        super(context, (int) C0126R.C0128layout.view_row_spinner, (int) C0126R.C0129id.description, list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo65737a() {
        int[] iArr = this.f124180c;
        if (iArr == null) {
            return getCount();
        }
        int i = 0;
        for (int i2 : iArr) {
            if (i2 == 8) {
                i++;
            }
        }
        return this.f124180c.length - i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo65738a(int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo65975b() {
        View view = new View(getContext());
        view.setVisibility(8);
        view.setLayoutParams(new AbsListView.LayoutParams(0, 0));
        return view;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        int[] iArr = this.f124180c;
        if (iArr == null || iArr[mo65738a(i)] != 8) {
            if (view == this.f124179b) {
                view = null;
            }
            View dropDownView = super.getDropDownView(i, view, viewGroup);
            int i2 = Build.VERSION.SDK_INT;
            if (this.f124181e == null) {
                this.f124181e = new bkfy(this);
            }
            dropDownView.setAccessibilityDelegate(this.f124181e);
            WalletCheckedTextView.m118770a(dropDownView, this.f124178a);
            return dropDownView;
        }
        if (this.f124179b == null) {
            this.f124179b = mo65975b();
        }
        return this.f124179b;
    }
}
