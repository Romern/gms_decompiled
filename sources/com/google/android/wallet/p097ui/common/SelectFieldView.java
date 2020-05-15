package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.google.android.wallet.ui.common.SelectFieldView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SelectFieldView extends LinearLayout implements AdapterView.OnItemSelectedListener, bkee, bkdd, bjwp, bjwm {

    /* renamed from: a */
    public FormSpinner f152189a;

    /* renamed from: b */
    public InlineSelectView f152190b;

    /* renamed from: c */
    public InfoMessageView f152191c;

    /* renamed from: d */
    public ImageWithCaptionView f152192d;

    /* renamed from: e */
    public TextView f152193e;

    /* renamed from: f */
    public View f152194f;

    /* renamed from: g */
    public bmqf f152195g;

    /* renamed from: h */
    public boolean f152196h;

    /* renamed from: i */
    public int f152197i;

    /* renamed from: j */
    public int f152198j = -1;

    /* renamed from: k */
    public boolean[] f152199k;

    /* renamed from: l */
    public View f152200l;

    /* renamed from: m */
    int[] f152201m;

    /* renamed from: n */
    private bjwk f152202n;

    /* renamed from: o */
    private final ArrayList f152203o = new ArrayList();

    /* renamed from: p */
    private boolean f152204p;

    public SelectFieldView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final int m118725a(String str) {
        bmpl bmpl;
        bmpl bmpl2;
        bmqf bmqf = this.f152195g;
        if (bmqf.f130373b == 7) {
            bmpl = (bmpl) bmqf.f130374c;
        } else {
            bmpl = bmpl.f130314g;
        }
        int size = bmpl.f130317b.size();
        for (int i = 0; i < size; i++) {
            bmqf bmqf2 = this.f152195g;
            if (bmqf2.f130373b == 7) {
                bmpl2 = (bmpl) bmqf2.f130374c;
            } else {
                bmpl2 = bmpl.f130314g;
            }
            if (TextUtils.equals(((bmpk) bmpl2.f130317b.get(i)).f130306g, str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    private final int m118726b(int i) {
        return this.f152196h ? i - 1 : i;
    }

    /* renamed from: a */
    public final void mo52946a(bjwk bjwk) {
        this.f152202n = bjwk;
    }

    /* renamed from: b */
    public final View mo65860b() {
        return this.f152194f;
    }

    /* access modifiers changed from: protected */
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        super.dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        super.dispatchFreezeSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f152189a = (FormSpinner) findViewById(C0126R.C0129id.ui_field_spinner);
        this.f152190b = (InlineSelectView) findViewById(C0126R.C0129id.ui_field_inline_select);
        this.f152191c = (InfoMessageView) findViewById(C0126R.C0129id.ui_field_info_message_description);
        this.f152192d = (ImageWithCaptionView) findViewById(C0126R.C0129id.ui_field_read_only_text_icon);
        this.f152193e = (TextView) findViewById(C0126R.C0129id.ui_field_read_only_text);
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        mo72085b(m118726b(i), view == null);
    }

    public final void onNothingSelected(AdapterView adapterView) {
        this.f152191c.mo72003a((bmnr) null);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("parentState"));
            this.f152189a.onRestoreInstanceState(bundle.getParcelable("formSpinnerState"));
            this.f152190b.onRestoreInstanceState(bundle.getParcelable("inlineSelectViewState"));
            this.f152191c.onRestoreInstanceState(bundle.getParcelable("infoMessageState"));
            this.f152192d.onRestoreInstanceState(bundle.getParcelable("readOnlyTextIconState"));
            this.f152193e.onRestoreInstanceState(bundle.getParcelable("readOnlyTextState"));
            m118727b(bundle.getBoolean("hiddenByDependencyGraph"));
            int[] intArray = bundle.getIntArray("optionVisibilities");
            this.f152201m = intArray;
            if (intArray != null) {
                ((bkfz) this.f152189a.getAdapter()).f124180c = this.f152201m;
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parentState", super.onSaveInstanceState());
        bundle.putParcelable("formSpinnerState", this.f152189a.onSaveInstanceState());
        bundle.putParcelable("inlineSelectViewState", this.f152190b.onSaveInstanceState());
        bundle.putParcelable("infoMessageState", this.f152191c.onSaveInstanceState());
        bundle.putParcelable("readOnlyTextIconState", this.f152192d.onSaveInstanceState());
        bundle.putParcelable("readOnlyTextState", this.f152193e.onSaveInstanceState());
        bundle.putBoolean("hiddenByDependencyGraph", this.f152204p);
        bundle.putIntArray("optionVisibilities", this.f152201m);
        return bundle;
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f152189a.setEnabled(z);
        this.f152190b.setEnabled(z);
        this.f152191c.setEnabled(z);
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f152200l;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* renamed from: b */
    private final void m118727b(boolean z) {
        this.f152204p = z;
        boolean z2 = false;
        setVisibility(!z ? 0 : 8);
        View view = this.f152194f;
        FormSpinner formSpinner = this.f152189a;
        if (view != formSpinner) {
            InlineSelectView inlineSelectView = this.f152190b;
            if (view == inlineSelectView) {
                if (!z && !this.f152195g.f130378g) {
                    z2 = true;
                }
                inlineSelectView.f152104d = z2;
                return;
            }
            return;
        }
        if (!z && !this.f152195g.f130378g) {
            z2 = true;
        }
        formSpinner.f152060n = z2;
    }

    public SelectFieldView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    public final void mo72085b(int i, boolean z) {
        bmpl bmpl;
        boolean z2;
        bmmw c;
        String str = null;
        if (i >= 0) {
            bmqf bmqf = this.f152195g;
            if (bmqf.f130373b == 7) {
                bmpl = (bmpl) bmqf.f130374c;
            } else {
                bmpl = bmpl.f130314g;
            }
            bmpk bmpk = (bmpk) bmpl.f130317b.get(i);
            InfoMessageView infoMessageView = this.f152191c;
            bmnr bmnr = bmpk.f130309j;
            if (bmnr == null) {
                bmnr = bmnr.f130153o;
            }
            infoMessageView.mo72003a(bmnr);
            if (i == this.f152197i && this.f152189a.getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z && !z2) {
                bjwk bjwk = this.f152202n;
                ArrayList arrayList = this.f152203o;
                long j = bmpk.f130308i;
                if ((bmpk.f130300a & 32) != 0) {
                    str = bmpk.f130306g;
                }
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    bjwj bjwj = (bjwj) arrayList.get(i2);
                    bmne bmne = bjwj.f123509a;
                    if (bjwl.m104785a(bmne) && ((c = bjwl.m104792c(bmne)) == null || c.f130062a.contains(Long.valueOf(j)) || ((c.f130062a.size() == 0 && c.f130063b.isEmpty()) || (str != null && Pattern.matches(c.f130063b, str))))) {
                        bjwk.mo65590a(bjwj);
                    }
                }
            }
        } else {
            this.f152191c.mo72003a((bmnr) null);
        }
        this.f152197i = i;
    }

    public SelectFieldView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SelectFieldView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    public final void mo72084a(int i) {
        if (this.f152196h) {
            i++;
        }
        this.f152189a.mo71972b(i);
    }

    /* renamed from: a */
    public final void mo65889a(int i, boolean z) {
        mo72085b(i, !z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: boolean} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.InlineSelectView.a(int, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.wallet.ui.common.InlineSelectView.a(java.lang.CharSequence, boolean):void
      com.google.android.wallet.ui.common.InlineSelectView.a(boolean[], boolean):void
      bkdf.a(java.lang.CharSequence, boolean):void
      com.google.android.wallet.ui.common.InlineSelectView.a(int, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.InlineSelectView.a(boolean[], boolean):void
     arg types: [boolean[], int]
     candidates:
      com.google.android.wallet.ui.common.InlineSelectView.a(int, boolean):void
      com.google.android.wallet.ui.common.InlineSelectView.a(java.lang.CharSequence, boolean):void
      bkdf.a(java.lang.CharSequence, boolean):void
      com.google.android.wallet.ui.common.InlineSelectView.a(boolean[], boolean):void */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        bmpl bmpl;
        bmmo bmmo;
        bmpl bmpl2;
        int a;
        int a2;
        bmpl bmpl3;
        bmmq bmmq;
        bmqk bmqk;
        bmqj bmqj;
        bmpl bmpl4;
        bmmq bmmq2;
        bmqk bmqk2;
        String str;
        int a3 = bmmb.m108166a(bmmv.f130058d);
        int i = 1;
        int i2 = 1;
        boolean z = true;
        int i3 = 1;
        if (a3 == 0) {
            a3 = 1;
        }
        int i4 = a3 - 1;
        int i5 = 0;
        int i6 = 0;
        if (i4 == 1) {
            m118727b(false);
        } else if (i4 == 2) {
            if (this.f152189a.getVisibility() == 0) {
                mo72084a(this.f152198j);
            }
            if (this.f152190b.getVisibility() == 0) {
                bmqf bmqf = this.f152195g;
                if (bmqf.f130373b == 7) {
                    bmpl = (bmpl) bmqf.f130374c;
                } else {
                    bmpl = bmpl.f130314g;
                }
                if (InlineSelectView.m118617a(bmpl)) {
                    this.f152190b.mo72018a(this.f152199k, ((Boolean) bjwe.f123476K.mo54082a()).booleanValue());
                    return;
                }
                int i7 = this.f152198j;
                InlineSelectView inlineSelectView = this.f152190b;
                if (i7 != inlineSelectView.f152105e) {
                    inlineSelectView.mo72017a(i7, ((Boolean) bjwe.f123476K.mo54082a()).booleanValue());
                }
            }
        } else if (i4 == 11) {
            m118727b(true);
        } else if (i4 == 12) {
            if (bmmv.f130056b == 9) {
                bmmo = (bmmo) bmmv.f130057c;
            } else {
                bmmo = bmmo.f130026d;
            }
            if (this.f152189a.getVisibility() == 0) {
                int a4 = bmml.m108176a(bmmo.f130030c);
                if ((a4 != 0 && a4 == 3) || ((a2 = bmml.m108176a(bmmo.f130030c)) != 0 && a2 == 2)) {
                    int a5 = bmmn.m108178a(bmmo.f130029b);
                    if ((a5 != 0 && a5 == 2) || ((a = bmmn.m108178a(bmmo.f130029b)) != 0 && a == 3)) {
                        bmqf bmqf2 = this.f152195g;
                        if (bmqf2.f130373b == 7) {
                            bmpl2 = (bmpl) bmqf2.f130374c;
                        } else {
                            bmpl2 = bmpl.f130314g;
                        }
                        bxvw bxvw = bmmo.f130028a;
                        int[] iArr = new int[bmpl2.f130317b.size()];
                        for (int i8 = 0; i8 < bmpl2.f130317b.size(); i8++) {
                            if (bxvw.contains(Long.valueOf(((bmpk) bmpl2.f130317b.get(i8)).f130308i))) {
                                int a6 = bmmn.m108178a(bmmo.f130029b);
                                if (a6 != 0 && a6 == 2) {
                                    iArr[i8] = 0;
                                } else {
                                    iArr[i8] = 8;
                                }
                            } else {
                                int a7 = bmml.m108176a(bmmo.f130030c);
                                if (a7 != 0 && a7 == 2) {
                                    int[] iArr2 = this.f152201m;
                                    iArr[i8] = iArr2 != null ? iArr2[i8] : 0;
                                } else {
                                    int a8 = bmmn.m108178a(bmmo.f130029b);
                                    if (a8 != 0 && a8 == 2) {
                                        iArr[i8] = 8;
                                    } else {
                                        iArr[i8] = 0;
                                    }
                                }
                            }
                        }
                        this.f152201m = iArr;
                        ((bkfz) this.f152189a.getAdapter()).f124180c = this.f152201m;
                        int b = m118726b(this.f152189a.getSelectedItemPosition());
                        if (b >= 0 && this.f152201m[b] == 8) {
                            while (true) {
                                int[] iArr3 = this.f152201m;
                                if (i5 < iArr3.length) {
                                    if (iArr3[i5] == 0) {
                                        break;
                                    }
                                    i5++;
                                } else {
                                    i5 = -1;
                                    break;
                                }
                            }
                            if (i5 != -1) {
                                mo72084a(i5);
                                return;
                            }
                            throw new IllegalArgumentException("There is no option visible after applying MODIFY_COMPONENT_VALUES action");
                        }
                        return;
                    }
                    Object[] objArr = new Object[1];
                    int a9 = bmmn.m108178a(bmmo.f130029b);
                    if (a9 != 0) {
                        i = a9;
                    }
                    objArr[0] = Integer.valueOf(i - 1);
                    throw new IllegalArgumentException(String.format("Unsupported modify type %s", objArr));
                }
                Object[] objArr2 = new Object[1];
                int a10 = bmml.m108176a(bmmo.f130030c);
                if (a10 != 0) {
                    i3 = a10;
                }
                objArr2[0] = Integer.valueOf(i3 - 1);
                throw new IllegalArgumentException(String.format("Unsupported modify component list type %s", objArr2));
            }
            throw new IllegalArgumentException("Currently only DROP_DOWN_MENU select field support MODIFY_COMPONENT_VALUES action");
        } else if (i4 == 17) {
            bmqf bmqf3 = this.f152195g;
            if (bmqf3.f130373b == 7) {
                bmpl3 = (bmpl) bmqf3.f130374c;
            } else {
                bmpl3 = bmpl.f130314g;
            }
            if (!InlineSelectView.m118617a(bmpl3)) {
                if (bmmv.f130056b == 11) {
                    bmmq2 = (bmmq) bmmv.f130057c;
                } else {
                    bmmq2 = bmmq.f130039c;
                }
                if (bmmq2.f130041a == 1) {
                    bmqk2 = (bmqk) bmmq2.f130042b;
                } else {
                    bmqk2 = bmqk.f130403g;
                }
                if (bmqk2.f130406b == 2) {
                    str = (String) bmqk2.f130407c;
                } else {
                    str = "";
                }
                int a11 = m118725a(str);
                InlineSelectView inlineSelectView2 = this.f152190b;
                if (a11 != inlineSelectView2.f152105e) {
                    inlineSelectView2.mo72017a(a11, true);
                    return;
                }
                return;
            }
            if (bmmv.f130056b == 11) {
                bmmq = (bmmq) bmmv.f130057c;
            } else {
                bmmq = bmmq.f130039c;
            }
            if (bmmq.f130041a == 1) {
                bmqk = (bmqk) bmmq.f130042b;
            } else {
                bmqk = bmqk.f130403g;
            }
            if (bmqk.f130406b == 11) {
                bmqj = (bmqj) bmqk.f130407c;
            } else {
                bmqj = bmqj.f130400b;
            }
            bmqf bmqf4 = this.f152195g;
            if (bmqf4.f130373b == 7) {
                bmpl4 = (bmpl) bmqf4.f130374c;
            } else {
                bmpl4 = bmpl.f130314g;
            }
            boolean[] zArr = new boolean[bmpl4.f130317b.size()];
            bxwc bxwc = bmqj.f130402a;
            int size = bxwc.size();
            for (i6++; i6 < size; i6++) {
                zArr[m118725a(((bmqi) bxwc.get(i6)).f130399b)] = true;
            }
            this.f152190b.mo72018a(zArr, true);
        } else if (i4 != 27) {
            Object[] objArr3 = new Object[1];
            int a12 = bmmb.m108166a(bmmv.f130058d);
            if (a12 != 0) {
                i2 = a12;
            }
            objArr3[0] = Integer.valueOf(i2 - 1);
            throw new IllegalArgumentException(String.format("Unknown ResultingActionReference action type %s", objArr3));
        } else {
            if (getVisibility() != 0) {
                z = false;
            }
            m118727b(z);
        }
    }

    /* renamed from: a */
    public final void mo52771a(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bjwj bjwj = (bjwj) arrayList.get(i);
            int a = bmna.m108191a(bjwj.f123509a.f130094d);
            int i2 = 1;
            if (a == 0) {
                a = 1;
            }
            int i3 = a - 1;
            if (i3 != 1) {
                if (i3 == 3) {
                    continue;
                } else if (i3 != 4) {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[1];
                    int a2 = bmna.m108191a(bjwj.f123509a.f130094d);
                    if (a2 != 0) {
                        i2 = a2;
                    }
                    objArr[0] = Integer.valueOf(i2 - 1);
                    throw new IllegalArgumentException(String.format(locale, "Unsupported trigger type: %s", objArr));
                }
            }
            this.f152203o.add(bjwj);
        }
    }

    /* renamed from: a */
    public final void mo65890a(boolean z) {
        if (z) {
            bjwl.m104781a(this.f152202n, this.f152203o);
        }
    }

    /* renamed from: a */
    public final boolean mo52055a(bmne bmne) {
        int i;
        bmpl bmpl;
        if (this.f152195g != null) {
            if (this.f152189a.getVisibility() == 0) {
                i = m118726b(this.f152189a.getSelectedItemPosition());
            } else {
                i = this.f152197i;
            }
            if (i >= 0) {
                bmqf bmqf = this.f152195g;
                if (bmqf.f130373b == 7) {
                    bmpl = (bmpl) bmqf.f130374c;
                } else {
                    bmpl = bmpl.f130314g;
                }
                return bjwl.m104786a(bmne, ((bmpk) bmpl.f130317b.get(i)).f130308i);
            }
        }
        return false;
    }
}
