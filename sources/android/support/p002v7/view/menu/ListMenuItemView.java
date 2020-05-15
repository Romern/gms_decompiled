package android.support.p002v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: android.support.v7.view.menu.ListMenuItemView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ListMenuItemView extends LinearLayout implements AbsListView.SelectionBoundsAdjuster, C1459wi {

    /* renamed from: a */
    public C1446vw f1097a;

    /* renamed from: b */
    public ImageView f1098b;

    /* renamed from: c */
    public boolean f1099c;

    /* renamed from: d */
    public boolean f1100d;

    /* renamed from: e */
    public boolean f1101e;

    /* renamed from: f */
    private ImageView f1102f;

    /* renamed from: g */
    private RadioButton f1103g;

    /* renamed from: h */
    private TextView f1104h;

    /* renamed from: i */
    private CheckBox f1105i;

    /* renamed from: j */
    private TextView f1106j;

    /* renamed from: k */
    private ImageView f1107k;

    /* renamed from: l */
    private LinearLayout f1108l;

    /* renamed from: m */
    private Drawable f1109m;

    /* renamed from: n */
    private int f1110n;

    /* renamed from: o */
    private Context f1111o;

    /* renamed from: p */
    private Drawable f1112p;

    /* renamed from: q */
    private LayoutInflater f1113q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.listMenuViewStyle);
    }

    /* renamed from: a */
    private final void m1245a(View view) {
        m1246a(view, -1);
    }

    /* renamed from: c */
    private final LayoutInflater m1247c() {
        if (this.f1113q == null) {
            this.f1113q = LayoutInflater.from(getContext());
        }
        return this.f1113q;
    }

    /* renamed from: a */
    public final C1446vw mo1208a() {
        return this.f1097a;
    }

    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1098b;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1098b.getLayoutParams();
            rect.top += this.f1098b.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    /* renamed from: b */
    public final boolean mo1210b() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        C1280ps.m19890a(this, this.f1109m);
        TextView textView = (TextView) findViewById(C0126R.C0129id.title);
        this.f1104h = textView;
        int i = this.f1110n;
        if (i != -1) {
            textView.setTextAppearance(this.f1111o, i);
        }
        this.f1106j = (TextView) findViewById(C0126R.C0129id.shortcut);
        ImageView imageView = (ImageView) findViewById(C0126R.C0129id.submenuarrow);
        this.f1107k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1112p);
        }
        this.f1098b = (ImageView) findViewById(C0126R.C0129id.group_divider);
        this.f1108l = (LinearLayout) findViewById(C0126R.C0129id.content);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (this.f1102f != null && this.f1099c) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1102f.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adr.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      adr.a(int, int):int
      adr.a(int, boolean):boolean */
    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        adr a = adr.m523a(getContext(), attributeSet, C1390tu.f27210s, i, 0);
        this.f1109m = a.mo449a(5);
        this.f1110n = a.mo460f(1, -1);
        this.f1099c = a.mo451a(7, false);
        this.f1111o = context;
        this.f1112p = a.mo449a(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, C0126R.attr.dropDownListViewStyle, 0);
        this.f1100d = obtainStyledAttributes.hasValue(0);
        a.mo450a();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private final void m1246a(View view, int i) {
        LinearLayout linearLayout = this.f1108l;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.support.v7.view.menu.ListMenuItemView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final void mo1209a(C1446vw vwVar) {
        int i;
        int i2;
        ImageView imageView;
        String str;
        int i3;
        RadioButton radioButton;
        CheckBox checkBox;
        CompoundButton compoundButton;
        this.f1097a = vwVar;
        int i4 = 0;
        if (!vwVar.isVisible()) {
            i = 8;
        } else {
            i = 0;
        }
        setVisibility(i);
        CharSequence a = vwVar.mo16278a((C1459wi) this);
        if (a != null) {
            this.f1104h.setText(a);
            if (this.f1104h.getVisibility() != 0) {
                this.f1104h.setVisibility(0);
            }
        } else if (this.f1104h.getVisibility() != 8) {
            this.f1104h.setVisibility(8);
        }
        boolean isCheckable = vwVar.isCheckable();
        if (!(!isCheckable && this.f1103g == null && this.f1105i == null)) {
            if (this.f1097a.mo16289e()) {
                if (this.f1103g == null) {
                    RadioButton radioButton2 = (RadioButton) m1247c().inflate((int) C0126R.C0128layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                    this.f1103g = radioButton2;
                    m1245a(radioButton2);
                }
                CompoundButton compoundButton2 = this.f1103g;
                checkBox = this.f1105i;
                radioButton = checkBox;
                compoundButton = compoundButton2;
            } else {
                if (this.f1105i == null) {
                    CheckBox checkBox2 = (CheckBox) m1247c().inflate((int) C0126R.C0128layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                    this.f1105i = checkBox2;
                    m1245a(checkBox2);
                }
                CompoundButton compoundButton3 = this.f1105i;
                radioButton = this.f1103g;
                checkBox = compoundButton3;
                compoundButton = compoundButton3;
            }
            if (isCheckable) {
                compoundButton.setChecked(this.f1097a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (!(radioButton == null || radioButton.getVisibility() == 8)) {
                    radioButton.setVisibility(8);
                }
            } else {
                if (checkBox != null) {
                    checkBox.setVisibility(8);
                }
                RadioButton radioButton3 = this.f1103g;
                if (radioButton3 != null) {
                    radioButton3.setVisibility(8);
                }
            }
        }
        boolean d = vwVar.mo16287d();
        vwVar.mo16284c();
        if (!d || !this.f1097a.mo16287d()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        if (i2 == 0) {
            TextView textView = this.f1106j;
            C1446vw vwVar2 = this.f1097a;
            char c = vwVar2.mo16284c();
            if (c != 0) {
                Resources resources = vwVar2.f27462i.f27423a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(vwVar2.f27462i.f27423a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(C0126R.string.abc_prepend_shortcut_label));
                }
                if (vwVar2.f27462i.mo16246c()) {
                    i3 = vwVar2.f27461h;
                } else {
                    i3 = vwVar2.f27459f;
                }
                C1446vw.m20647a(sb, i3, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE, resources.getString(C0126R.string.abc_menu_meta_shortcut_label));
                C1446vw.m20647a(sb, i3, 4096, resources.getString(C0126R.string.abc_menu_ctrl_shortcut_label));
                C1446vw.m20647a(sb, i3, 2, resources.getString(C0126R.string.abc_menu_alt_shortcut_label));
                C1446vw.m20647a(sb, i3, 1, resources.getString(C0126R.string.abc_menu_shift_shortcut_label));
                C1446vw.m20647a(sb, i3, 4, resources.getString(C0126R.string.abc_menu_sym_shortcut_label));
                C1446vw.m20647a(sb, i3, 8, resources.getString(C0126R.string.abc_menu_function_shortcut_label));
                if (c == 8) {
                    sb.append(resources.getString(C0126R.string.abc_menu_delete_shortcut_label));
                } else if (c == 10) {
                    sb.append(resources.getString(C0126R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(C0126R.string.abc_menu_space_shortcut_label));
                }
                str = sb.toString();
            } else {
                str = "";
            }
            textView.setText(str);
        }
        if (this.f1106j.getVisibility() != i2) {
            this.f1106j.setVisibility(i2);
        }
        Drawable icon = vwVar.getIcon();
        boolean z = this.f1101e;
        if ((z || this.f1099c) && !((imageView = this.f1102f) == null && icon == null && !this.f1099c)) {
            if (imageView == null) {
                ImageView imageView2 = (ImageView) m1247c().inflate((int) C0126R.C0128layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1102f = imageView2;
                m1246a(imageView2, 0);
            }
            if (icon == null && !this.f1099c) {
                this.f1102f.setVisibility(8);
            } else {
                ImageView imageView3 = this.f1102f;
                if (!z) {
                    icon = null;
                }
                imageView3.setImageDrawable(icon);
                if (this.f1102f.getVisibility() != 0) {
                    this.f1102f.setVisibility(0);
                }
            }
        }
        setEnabled(vwVar.isEnabled());
        boolean hasSubMenu = vwVar.hasSubMenu();
        ImageView imageView4 = this.f1107k;
        if (imageView4 != null) {
            if (!hasSubMenu) {
                i4 = 8;
            }
            imageView4.setVisibility(i4);
        }
        setContentDescription(vwVar.f27464k);
    }
}
