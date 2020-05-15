package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.p001v4.widget.NestedScrollView;
import android.support.p002v7.app.AlertController$RecycleListView;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: sh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1350sh extends C1374te implements DialogInterface {

    /* renamed from: a */
    public final C1348sf f27024a = new C1348sf(getContext(), this, getWindow());

    protected C1350sh(Context context, int i) {
        super(context, m20224a(context, i));
    }

    /* renamed from: a */
    static int m20224a(Context context, int i) {
        if ((i >>> 24) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0126R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public final Button mo15913a(int i) {
        C1348sf sfVar = this.f27024a;
        return i != -2 ? sfVar.f27005j : sfVar.f27008m;
    }

    /* renamed from: a */
    public final ListView mo15914a() {
        return this.f27024a.f27001f;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:135:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02aa A[ADDED_TO_REGION] */
    public final void onCreate(Bundle bundle) {
        int i;
        ViewGroup a;
        ViewGroup a2;
        TextView textView;
        boolean z;
        TypedValue typedValue;
        boolean z2;
        int i2;
        boolean z3;
        ListView listView;
        ListView listView2;
        ListAdapter listAdapter;
        int i3;
        int i4;
        View findViewById;
        View findViewById2;
        super.onCreate(bundle);
        C1348sf sfVar = this.f27024a;
        if (sfVar.f26989C != 0) {
            i = sfVar.f26988B;
        } else {
            i = sfVar.f26988B;
        }
        sfVar.f26997b.setContentView(i);
        View findViewById3 = sfVar.f26998c.findViewById(C0126R.C0129id.parentPanel);
        View findViewById4 = findViewById3.findViewById(C0126R.C0129id.topPanel);
        View findViewById5 = findViewById3.findViewById(C0126R.C0129id.contentPanel);
        View findViewById6 = findViewById3.findViewById(C0126R.C0129id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C0126R.C0129id.customPanel);
        View view = sfVar.f27002g;
        View view2 = null;
        int i5 = 0;
        if (view == null) {
            view = sfVar.f27003h != 0 ? LayoutInflater.from(sfVar.f26996a).inflate(sfVar.f27003h, viewGroup, false) : null;
        }
        if (view == null || !C1348sf.m20196a(view)) {
            sfVar.f26998c.setFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE, AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE);
            if (view == null) {
                viewGroup.setVisibility(8);
                View findViewById7 = viewGroup.findViewById(C0126R.C0129id.topPanel);
                View findViewById8 = viewGroup.findViewById(C0126R.C0129id.contentPanel);
                View findViewById9 = viewGroup.findViewById(C0126R.C0129id.buttonPanel);
                a = C1348sf.m20194a(findViewById7, findViewById4);
                ViewGroup a3 = C1348sf.m20194a(findViewById8, findViewById5);
                a2 = C1348sf.m20194a(findViewById9, findViewById6);
                sfVar.f27014s = (NestedScrollView) sfVar.f26998c.findViewById(C0126R.C0129id.scrollView);
                sfVar.f27014s.setFocusable(false);
                sfVar.f27014s.setNestedScrollingEnabled(false);
                sfVar.f27019x = (TextView) a3.findViewById(16908299);
                textView = sfVar.f27019x;
                if (textView != null) {
                    CharSequence charSequence = sfVar.f27000e;
                    if (charSequence == null) {
                        textView.setVisibility(8);
                        sfVar.f27014s.removeView(sfVar.f27019x);
                        if (sfVar.f27001f != null) {
                            ViewGroup viewGroup2 = (ViewGroup) sfVar.f27014s.getParent();
                            int indexOfChild = viewGroup2.indexOfChild(sfVar.f27014s);
                            viewGroup2.removeViewAt(indexOfChild);
                            viewGroup2.addView(sfVar.f27001f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                        } else {
                            a3.setVisibility(8);
                        }
                    } else {
                        textView.setText(charSequence);
                    }
                }
                sfVar.f27005j = (Button) a2.findViewById(16908313);
                sfVar.f27005j.setOnClickListener(sfVar.f26995I);
                if (!TextUtils.isEmpty(sfVar.f27006k)) {
                    sfVar.f27005j.setVisibility(8);
                    z = false;
                } else {
                    sfVar.f27005j.setText(sfVar.f27006k);
                    sfVar.f27005j.setVisibility(0);
                    z = true;
                }
                sfVar.f27008m = (Button) a2.findViewById(16908314);
                sfVar.f27008m.setOnClickListener(sfVar.f26995I);
                if (!TextUtils.isEmpty(sfVar.f27009n)) {
                    sfVar.f27008m.setVisibility(8);
                } else {
                    sfVar.f27008m.setText(sfVar.f27009n);
                    sfVar.f27008m.setVisibility(0);
                    z |= true;
                }
                sfVar.f27011p = (Button) a2.findViewById(16908315);
                sfVar.f27011p.setOnClickListener(sfVar.f26995I);
                if (!TextUtils.isEmpty(sfVar.f27012q)) {
                    sfVar.f27011p.setVisibility(8);
                } else {
                    sfVar.f27011p.setText(sfVar.f27012q);
                    sfVar.f27011p.setVisibility(0);
                    z |= true;
                }
                Context context = sfVar.f26996a;
                typedValue = new TypedValue();
                context.getTheme().resolveAttribute(C0126R.attr.alertDialogCenterButtons, typedValue, true);
                if (typedValue.data != 0) {
                    if (z) {
                        C1348sf.m20195a(sfVar.f27005j);
                    } else if (z) {
                        C1348sf.m20195a(sfVar.f27008m);
                    } else if (z) {
                        C1348sf.m20195a(sfVar.f27011p);
                    }
                    if (sfVar.f27020y != null) {
                        a.addView(sfVar.f27020y, 0, new ViewGroup.LayoutParams(-1, -2));
                        sfVar.f26998c.findViewById(C0126R.C0129id.title_template).setVisibility(8);
                    } else {
                        sfVar.f27017v = (ImageView) sfVar.f26998c.findViewById(16908294);
                        if (!TextUtils.isEmpty(sfVar.f26999d) && sfVar.f26993G) {
                            sfVar.f27018w = (TextView) sfVar.f26998c.findViewById(C0126R.C0129id.alertTitle);
                            sfVar.f27018w.setText(sfVar.f26999d);
                            int i6 = sfVar.f27015t;
                            if (i6 == 0) {
                                Drawable drawable = sfVar.f27016u;
                                if (drawable == null) {
                                    sfVar.f27018w.setPadding(sfVar.f27017v.getPaddingLeft(), sfVar.f27017v.getPaddingTop(), sfVar.f27017v.getPaddingRight(), sfVar.f27017v.getPaddingBottom());
                                    sfVar.f27017v.setVisibility(8);
                                } else {
                                    sfVar.f27017v.setImageDrawable(drawable);
                                }
                            } else {
                                sfVar.f27017v.setImageResource(i6);
                            }
                        } else {
                            sfVar.f26998c.findViewById(C0126R.C0129id.title_template).setVisibility(8);
                            sfVar.f27017v.setVisibility(8);
                            a.setVisibility(8);
                        }
                    }
                    z2 = viewGroup == null && viewGroup.getVisibility() != 8;
                    i2 = (a != null || a.getVisibility() == 8) ? 0 : 1;
                    z3 = a2 == null && a2.getVisibility() != 8;
                    if (!(z3 || a3 == null || (findViewById2 = a3.findViewById(C0126R.C0129id.textSpacerNoButtons)) == null)) {
                        findViewById2.setVisibility(0);
                    }
                    if (i2 != 0) {
                        NestedScrollView nestedScrollView = sfVar.f27014s;
                        if (nestedScrollView != null) {
                            nestedScrollView.setClipToPadding(true);
                        }
                        if (!(sfVar.f27000e == null && sfVar.f27001f == null)) {
                            view2 = a.findViewById(C0126R.C0129id.titleDividerNoCustom);
                        }
                        if (view2 != null) {
                            view2.setVisibility(0);
                        }
                    } else if (!(a3 == null || (findViewById = a3.findViewById(C0126R.C0129id.textSpacerNoTitle)) == null)) {
                        findViewById.setVisibility(0);
                    }
                    listView = sfVar.f27001f;
                    if ((listView instanceof AlertController$RecycleListView) && (!z3 || i2 == 0)) {
                        AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) listView;
                        int paddingLeft = alertController$RecycleListView.getPaddingLeft();
                        if (i2 == 0) {
                            i3 = alertController$RecycleListView.f1078a;
                        } else {
                            i3 = alertController$RecycleListView.getPaddingTop();
                        }
                        int paddingRight = alertController$RecycleListView.getPaddingRight();
                        if (!z3) {
                            i4 = alertController$RecycleListView.f1079b;
                        } else {
                            i4 = alertController$RecycleListView.getPaddingBottom();
                        }
                        alertController$RecycleListView.setPadding(paddingLeft, i3, paddingRight, i4);
                    }
                    if (!z2) {
                        View view3 = sfVar.f27001f;
                        if (view3 == null) {
                            view3 = sfVar.f27014s;
                        }
                        if (view3 != null) {
                            if (z3) {
                                i5 = 2;
                            }
                            View findViewById10 = sfVar.f26998c.findViewById(C0126R.C0129id.scrollIndicatorUp);
                            View findViewById11 = sfVar.f26998c.findViewById(C0126R.C0129id.scrollIndicatorDown);
                            int i7 = Build.VERSION.SDK_INT;
                            C1280ps.m19928j(view3, i2 | i5);
                            if (findViewById10 != null) {
                                a3.removeView(findViewById10);
                            }
                            if (findViewById11 != null) {
                                a3.removeView(findViewById11);
                            }
                        }
                    }
                    listView2 = sfVar.f27001f;
                    if (listView2 == null && (listAdapter = sfVar.f27021z) != null) {
                        listView2.setAdapter(listAdapter);
                        int i8 = sfVar.f26987A;
                        if (i8 >= 0) {
                            listView2.setItemChecked(i8, true);
                            listView2.setSelection(i8);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!z) {
                    a2.setVisibility(8);
                }
                if (sfVar.f27020y != null) {
                }
                if (viewGroup == null) {
                }
                if (a != null) {
                }
                if (a2 == null) {
                }
                findViewById2.setVisibility(0);
                if (i2 != 0) {
                }
                listView = sfVar.f27001f;
                AlertController$RecycleListView alertController$RecycleListView2 = (AlertController$RecycleListView) listView;
                int paddingLeft2 = alertController$RecycleListView2.getPaddingLeft();
                if (i2 == 0) {
                }
                int paddingRight2 = alertController$RecycleListView2.getPaddingRight();
                if (!z3) {
                }
                alertController$RecycleListView2.setPadding(paddingLeft2, i3, paddingRight2, i4);
                if (!z2) {
                }
                listView2 = sfVar.f27001f;
                if (listView2 == null) {
                    return;
                }
                return;
            }
        }
        ((FrameLayout) sfVar.f26998c.findViewById(C0126R.C0129id.custom)).addView(view, new ViewGroup.LayoutParams(-1, -1));
        boolean z4 = sfVar.f27004i;
        if (sfVar.f27001f != null) {
            ((aac) viewGroup.getLayoutParams()).f11g = 0.0f;
        }
        View findViewById72 = viewGroup.findViewById(C0126R.C0129id.topPanel);
        View findViewById82 = viewGroup.findViewById(C0126R.C0129id.contentPanel);
        View findViewById92 = viewGroup.findViewById(C0126R.C0129id.buttonPanel);
        a = C1348sf.m20194a(findViewById72, findViewById4);
        ViewGroup a32 = C1348sf.m20194a(findViewById82, findViewById5);
        a2 = C1348sf.m20194a(findViewById92, findViewById6);
        sfVar.f27014s = (NestedScrollView) sfVar.f26998c.findViewById(C0126R.C0129id.scrollView);
        sfVar.f27014s.setFocusable(false);
        sfVar.f27014s.setNestedScrollingEnabled(false);
        sfVar.f27019x = (TextView) a32.findViewById(16908299);
        textView = sfVar.f27019x;
        if (textView != null) {
        }
        sfVar.f27005j = (Button) a2.findViewById(16908313);
        sfVar.f27005j.setOnClickListener(sfVar.f26995I);
        if (!TextUtils.isEmpty(sfVar.f27006k)) {
        }
        sfVar.f27008m = (Button) a2.findViewById(16908314);
        sfVar.f27008m.setOnClickListener(sfVar.f26995I);
        if (!TextUtils.isEmpty(sfVar.f27009n)) {
        }
        sfVar.f27011p = (Button) a2.findViewById(16908315);
        sfVar.f27011p.setOnClickListener(sfVar.f26995I);
        if (!TextUtils.isEmpty(sfVar.f27012q)) {
        }
        Context context2 = sfVar.f26996a;
        typedValue = new TypedValue();
        context2.getTheme().resolveAttribute(C0126R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
        }
        if (!z) {
        }
        if (sfVar.f27020y != null) {
        }
        if (viewGroup == null) {
        }
        if (a != null) {
        }
        if (a2 == null) {
        }
        findViewById2.setVisibility(0);
        if (i2 != 0) {
        }
        listView = sfVar.f27001f;
        AlertController$RecycleListView alertController$RecycleListView22 = (AlertController$RecycleListView) listView;
        int paddingLeft22 = alertController$RecycleListView22.getPaddingLeft();
        if (i2 == 0) {
        }
        int paddingRight22 = alertController$RecycleListView22.getPaddingRight();
        if (!z3) {
        }
        alertController$RecycleListView22.setPadding(paddingLeft22, i3, paddingRight22, i4);
        if (!z2) {
        }
        listView2 = sfVar.f27001f;
        if (listView2 == null) {
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f27024a.f27014s;
        if (nestedScrollView == null || !nestedScrollView.mo1138a(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f27024a.f27014s;
        if (nestedScrollView == null || !nestedScrollView.mo1138a(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f27024a.mo15887a(charSequence);
    }
}
