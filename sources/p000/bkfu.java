package p000;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.android.volley.toolbox.ImageLoader;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.common.CheckboxView;
import com.google.android.wallet.p097ui.common.CountDownTextView;
import com.google.android.wallet.p097ui.common.FillingDotsUiFieldView;
import com.google.android.wallet.p097ui.common.FormEditText;
import com.google.android.wallet.p097ui.common.FormSpinner;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import com.google.android.wallet.p097ui.common.InlineSelectView;
import com.google.android.wallet.p097ui.common.SelectFieldView;
import com.google.android.wallet.p097ui.date.DatePickerView;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: bkfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkfu {

    /* renamed from: a */
    public Activity f124162a;

    /* renamed from: b */
    public FragmentManager f124163b;

    /* renamed from: c */
    public LogContext f124164c;

    /* renamed from: d */
    public bkfk f124165d;

    /* renamed from: e */
    public bjwk f124166e;

    /* renamed from: f */
    public bkdw f124167f;

    /* renamed from: g */
    public boolean f124168g;

    /* renamed from: h */
    public int f124169h = 1;

    /* renamed from: i */
    private bmqf f124170i;

    /* renamed from: j */
    private final LayoutInflater f124171j;

    /* renamed from: k */
    private final ViewGroup f124172k;

    /* renamed from: l */
    private bjxv f124173l;

    public bkfu(bmqf bmqf, LayoutInflater layoutInflater, bjxv bjxv, ViewGroup viewGroup) {
        if (bjxv != null) {
            this.f124170i = bmqf;
            this.f124171j = layoutInflater;
            this.f124173l = bjxv;
            this.f124172k = viewGroup;
            return;
        }
        throw new IllegalArgumentException(bkfr.m105591b(bmqf.f130375d, "IdGenerator not set."));
    }

    /* renamed from: a */
    private final void m105647a(View view) {
        if (this.f124170i.f130387p) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
            } else {
                layoutParams.width = -2;
            }
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: additional move instructions added (2) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:278:0x0771 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.wallet.ui.common.InlineSelectView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final View mo65971a() {
        bkfu bkfu;
        View view;
        int a;
        TextView textView;
        bmqe bmqe;
        bmqe bmqe2;
        bmqe bmqe3;
        bmqe bmqe4;
        bmqe bmqe5;
        bmqe bmqe6;
        int i;
        bmpe bmpe;
        bmpe bmpe2;
        int i2;
        bmpe bmpe3;
        boolean z;
        boolean z2;
        bmpe bmpe4;
        bmpe bmpe5;
        bmpe bmpe6;
        bmpe bmpe7;
        bmoz bmoz;
        bmnr bmnr;
        bmow bmow;
        bmpl bmpl;
        bmpl bmpl2;
        boolean z3;
        View view2;
        int i3;
        bxwc bxwc;
        View view3;
        bmpl bmpl3;
        boolean z4;
        ArrayAdapter arrayAdapter;
        String str;
        bmpl bmpl4;
        bmpl bmpl5;
        Activity activity = this.f124162a;
        ImageLoader b = activity != null ? bjvn.m104721b(activity.getApplicationContext()) : null;
        int i4 = 0;
        if (bkft.m105637a(this.f124169h, this.f124170i)) {
            bmqf bmqf = this.f124170i;
            TextView textView2 = (TextView) this.f124171j.inflate((int) C0126R.C0128layout.view_form_non_editable_text_compact, this.f124172k, false);
            textView2.setText(bkft.m105644c(bmqf));
            bkfu = this;
            view = textView2;
        } else {
            bmqf bmqf2 = this.f124170i;
            int i5 = bmqf2.f130373b;
            if (i5 == 6) {
                bkfu = this;
                if (bkft.m105640a(bmqf2)) {
                    textView = bkft.m105628a(bkfu.f124170i, bkfu.f124171j, bkfu.f124172k);
                } else {
                    bmqf bmqf3 = bkfu.f124170i;
                    if (bmqf3.f130373b == 6) {
                        bmqe6 = (bmqe) bmqf3.f130374c;
                    } else {
                        bmqe6 = bmqe.f130351s;
                    }
                    int a2 = bmps.m108264a(bmqe6.f130369r);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    if (a2 - 1 != 2) {
                        i = C0126R.C0128layout.view_form_edit_text;
                    } else {
                        i = C0126R.C0128layout.view_form_edit_text_large;
                    }
                    View inflate = bkfu.f124171j.inflate(i, bkfu.f124172k, false);
                    FormEditText formEditText = (FormEditText) inflate;
                    formEditText.mo71919a(bkfu.f124164c);
                    formEditText.f152010ah = bkfu.f124166e;
                    bkfu.f124170i = bkft.m105630a(bkfu.f124170i, formEditText, bkfu.f124162a);
                    textView = inflate;
                }
                if (bkfu.f124168g) {
                    ((TextView) textView).setGravity(1);
                }
                bmqf bmqf4 = bkfu.f124170i;
                if (bmqf4.f130373b == 6) {
                    bmqe = (bmqe) bmqf4.f130374c;
                } else {
                    bmqe = bmqe.f130351s;
                }
                int a3 = bmpy.m108272a(bmqe.f130367p);
                view = textView;
                view = textView;
                if (a3 != 0 && a3 == 4) {
                    bmqf bmqf5 = bkfu.f124170i;
                    if (bmqf5.f130373b == 6) {
                        bmqe2 = (bmqe) bmqf5.f130374c;
                    } else {
                        bmqe2 = bmqe.f130351s;
                    }
                    int i6 = bmqe2.f130356d;
                    bmqf bmqf6 = bkfu.f124170i;
                    if (bmqf6.f130373b == 6) {
                        bmqe3 = (bmqe) bmqf6.f130374c;
                    } else {
                        bmqe3 = bmqe.f130351s;
                    }
                    if (i6 == bmqe3.f130357e) {
                        bmqf bmqf7 = bkfu.f124170i;
                        if (bmqf7.f130373b == 6) {
                            bmqe4 = (bmqe) bmqf7.f130374c;
                        } else {
                            bmqe4 = bmqe.f130351s;
                        }
                        if (bmqe4.f130356d > 0) {
                            FormEditText formEditText2 = (FormEditText) textView;
                            formEditText2.setId(bkfu.f124173l.mo65614a());
                            FillingDotsUiFieldView fillingDotsUiFieldView = (FillingDotsUiFieldView) bkfu.f124171j.inflate((int) C0126R.C0128layout.view_tv_pin_challenge, bkfu.f124172k, false);
                            bmqf bmqf8 = bkfu.f124170i;
                            if (bmqf8.f130373b == 6) {
                                bmqe5 = (bmqe) bmqf8.f130374c;
                            } else {
                                bmqe5 = bmqe.f130351s;
                            }
                            int i7 = bmqe5.f130356d;
                            ViewGroup.LayoutParams layoutParams = formEditText2.getLayoutParams();
                            layoutParams.height = 0;
                            layoutParams.width = 0;
                            formEditText2.setLayoutParams(layoutParams);
                            formEditText2.addTextChangedListener(fillingDotsUiFieldView);
                            formEditText2.setOnEditorActionListener(fillingDotsUiFieldView);
                            formEditText2.setOnFocusChangeListener(fillingDotsUiFieldView);
                            formEditText2.f151990J = fillingDotsUiFieldView;
                            formEditText2.setOnKeyListener(fillingDotsUiFieldView);
                            fillingDotsUiFieldView.addView(formEditText2);
                            fillingDotsUiFieldView.f151959a = formEditText2;
                            fillingDotsUiFieldView.f151960b = i7;
                            for (int i8 = 0; i8 < i7; i8++) {
                                ImageView imageView = new ImageView(fillingDotsUiFieldView.getContext());
                                imageView.setImageResource(C0126R.C0127drawable.wallet_uic_dot_unfilled);
                                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                                C1260oz.m19821a(layoutParams2, (int) bkfr.m105541a(8.0f));
                                imageView.setLayoutParams(layoutParams2);
                                fillingDotsUiFieldView.addView(imageView);
                            }
                            view = fillingDotsUiFieldView;
                        } else {
                            throw new IllegalArgumentException(bkfr.m105591b(bkfu.f124170i.f130375d, "Text field min_length must be greater than 0."));
                        }
                    } else {
                        throw new IllegalArgumentException(bkfr.m105591b(bkfu.f124170i.f130375d, "Filling dots mask type requires that min_length == max_length."));
                    }
                }
            } else if (i5 == 16) {
                bkfu = this;
                if (bkft.m105640a(bmqf2)) {
                    view = bkft.m105628a(bkfu.f124170i, bkfu.f124171j, bkfu.f124172k);
                } else {
                    bmqf bmqf9 = bkfu.f124170i;
                    if (bmqf9.f130373b == 16) {
                        bmpe = (bmpe) bmqf9.f130374c;
                    } else {
                        bmpe = bmpe.f130279k;
                    }
                    if (!bmpe.f130286f) {
                        view = bkfu.f124171j.inflate((int) C0126R.C0128layout.view_date_edit_text, bkfu.f124172k, false);
                        bmqf bmqf10 = bkfu.f124170i;
                        if (bmqf10.f130373b == 16) {
                            bmpe3 = (bmpe) bmqf10.f130374c;
                        } else {
                            bmpe3 = bmpe.f130279k;
                        }
                        int a4 = bmpd.m108249a(bmpe3.f130282b);
                        if (a4 == 0) {
                            z = false;
                        } else {
                            z = a4 == 3 && bkfu.f124170i.f130380i.isEmpty();
                        }
                        if (z) {
                            bmqf bmqf11 = bkfu.f124170i;
                            if (bmqf11.f130373b == 16) {
                                bmpe5 = (bmpe) bmqf11.f130374c;
                            } else {
                                bmpe5 = bmpe.f130279k;
                            }
                            if (bmpe5.f130290j.isEmpty()) {
                                bmqf bmqf12 = bkfu.f124170i;
                                bxvd bxvd = (bxvd) bmqf12.mo74142c(5);
                                bxvd.mo73625a((GeneratedMessageLite) bmqf12);
                                bmqf bmqf13 = bkfu.f124170i;
                                if (bmqf13.f130373b == 16) {
                                    bmpe7 = (bmpe) bmqf13.f130374c;
                                } else {
                                    bmpe7 = bmpe.f130279k;
                                }
                                bxvd bxvd2 = (bxvd) bmpe7.mo74142c(5);
                                bxvd2.mo73625a((GeneratedMessageLite) bmpe7);
                                if (bxvd2.f164950c) {
                                    bxvd2.mo74035c();
                                    bxvd2.f164950c = false;
                                }
                                bmpe bmpe8 = (bmpe) bxvd2.f164949b;
                                bmpe bmpe9 = bmpe.f130279k;
                                "/".getClass();
                                bmpe8.f130281a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                bmpe8.f130290j = "/";
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                bmqf bmqf14 = (bmqf) bxvd.f164949b;
                                bmpe bmpe10 = (bmpe) bxvd2.mo74062i();
                                bmqf bmqf15 = bmqf.f130370r;
                                bmpe10.getClass();
                                bmqf14.f130374c = bmpe10;
                                bmqf14.f130373b = 16;
                                bkfu.f124170i = (bmqf) bxvd.mo74062i();
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            bmqf bmqf16 = bkfu.f124170i;
                            bxvd bxvd3 = (bxvd) bmqf16.mo74142c(5);
                            bxvd3.mo73625a((GeneratedMessageLite) bmqf16);
                            Context context = bkfu.f124171j.getContext();
                            Object[] objArr = new Object[1];
                            bmqf bmqf17 = bkfu.f124170i;
                            if (bmqf17.f130373b == 16) {
                                bmpe6 = (bmpe) bmqf17.f130374c;
                            } else {
                                bmpe6 = bmpe.f130279k;
                            }
                            objArr[0] = bmpe6.f130290j;
                            String string = context.getString(C0126R.string.wallet_uic_exp_date, objArr);
                            if (bxvd3.f164950c) {
                                bxvd3.mo74035c();
                                bxvd3.f164950c = false;
                            }
                            bmqf bmqf18 = (bmqf) bxvd3.f164949b;
                            bmqf bmqf19 = bmqf.f130370r;
                            string.getClass();
                            bmqf18.f130372a |= 32;
                            bmqf18.f130380i = string;
                            bkfu.f124170i = (bmqf) bxvd3.mo74062i();
                        } else {
                            z2 = false;
                        }
                        FormEditText formEditText3 = (FormEditText) view;
                        formEditText3.mo71919a(bkfu.f124164c);
                        formEditText3.f152010ah = bkfu.f124166e;
                        bmqf a5 = bkft.m105630a(bkfu.f124170i, formEditText3, bkfu.f124162a);
                        bkfu.f124170i = a5;
                        if (z) {
                            bxvd bxvd4 = (bxvd) a5.mo74142c(5);
                            bxvd4.mo73625a((GeneratedMessageLite) a5);
                            if (bxvd4.f164950c) {
                                bxvd4.mo74035c();
                                bxvd4.f164950c = false;
                            }
                            bmqf bmqf20 = (bmqf) bxvd4.f164949b;
                            bmqf bmqf21 = bmqf.f130370r;
                            "".getClass();
                            bmqf20.f130372a |= 32;
                            bmqf20.f130380i = "";
                            bkfu.f124170i = (bmqf) bxvd4.mo74062i();
                        }
                        if (z2) {
                            bmqf bmqf22 = bkfu.f124170i;
                            bxvd bxvd5 = (bxvd) bmqf22.mo74142c(5);
                            bxvd5.mo73625a((GeneratedMessageLite) bmqf22);
                            bmqf bmqf23 = bkfu.f124170i;
                            if (bmqf23.f130373b == 16) {
                                bmpe4 = (bmpe) bmqf23.f130374c;
                            } else {
                                bmpe4 = bmpe.f130279k;
                            }
                            bxvd bxvd6 = (bxvd) bmpe4.mo74142c(5);
                            bxvd6.mo73625a((GeneratedMessageLite) bmpe4);
                            if (bxvd6.f164950c) {
                                bxvd6.mo74035c();
                                bxvd6.f164950c = false;
                            }
                            bmpe bmpe11 = (bmpe) bxvd6.f164949b;
                            bmpe bmpe12 = bmpe.f130279k;
                            "".getClass();
                            bmpe11.f130281a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            bmpe11.f130290j = "";
                            if (bxvd5.f164950c) {
                                bxvd5.mo74035c();
                                bxvd5.f164950c = false;
                            }
                            bmqf bmqf24 = (bmqf) bxvd5.f164949b;
                            bmpe bmpe13 = (bmpe) bxvd6.mo74062i();
                            bmqf bmqf25 = bmqf.f130370r;
                            bmpe13.getClass();
                            bmqf24.f130374c = bmpe13;
                            bmqf24.f130373b = 16;
                            bkfu.f124170i = (bmqf) bxvd5.mo74062i();
                        }
                    } else {
                        DatePickerView datePickerView = (DatePickerView) bkfu.f124171j.inflate((int) C0126R.C0128layout.view_date_picker, bkfu.f124172k, false);
                        bmqf bmqf26 = bkfu.f124170i;
                        FragmentManager fragmentManager = bkfu.f124163b;
                        bjxv bjxv = bkfu.f124173l;
                        datePickerView.f152278c = bmqf26;
                        if (bmqf26.f130373b == 16) {
                            bmpe2 = (bmpe) bmqf26.f130374c;
                        } else {
                            bmpe2 = bmpe.f130279k;
                        }
                        datePickerView.f152279d = bmpe2;
                        datePickerView.f152281f = fragmentManager;
                        bmpe bmpe14 = datePickerView.f152279d;
                        String str2 = bmpe14.f130289i;
                        int a6 = bmpd.m108249a(bmpe14.f130282b);
                        if (a6 != 0) {
                            i2 = a6;
                        } else {
                            i2 = 1;
                        }
                        datePickerView.f152280e = new bjvf(str2, i2, datePickerView.f152279d.f130290j);
                        datePickerView.f152276a.setText(bmqf26.f130380i);
                        datePickerView.f152277b.setId(bjxv.mo65614a());
                        datePickerView.f152277b.setTextColor(bkfr.m105600c(datePickerView.getContext()));
                        bmpe bmpe15 = datePickerView.f152279d;
                        if ((bmpe15.f130281a & 8) != 0) {
                            blxc blxc = bmpe15.f130285e;
                            if (blxc == null) {
                                blxc = blxc.f128037e;
                            }
                            int i9 = blxc.f128040b;
                            blxc blxc2 = datePickerView.f152279d.f130285e;
                            if (blxc2 == null) {
                                blxc2 = blxc.f128037e;
                            }
                            int i10 = blxc2.f128041c;
                            blxc blxc3 = datePickerView.f152279d.f130285e;
                            if (blxc3 == null) {
                                blxc3 = blxc.f128037e;
                            }
                            datePickerView.mo72135a(i9, i10, blxc3.f128042d);
                        }
                        view = datePickerView;
                        if (bmqf26.f130379h) {
                            datePickerView.setEnabled(false);
                            view = datePickerView;
                        }
                    }
                }
            } else if (i5 == 7) {
                View inflate2 = this.f124171j.inflate((int) C0126R.C0128layout.view_select_field, this.f124172k, false);
                SelectFieldView selectFieldView = (SelectFieldView) inflate2;
                bmqf bmqf27 = this.f124170i;
                LogContext logContext = this.f124164c;
                selectFieldView.f152195g = bmqf27;
                bmqf bmqf28 = selectFieldView.f152195g;
                if (bmqf28.f130373b == 7) {
                    bmpl = (bmpl) bmqf28.f130374c;
                } else {
                    bmpl = bmpl.f130314g;
                }
                if (bmpl == null || bmpl.f130317b.size() == 0) {
                    throw new IllegalArgumentException("SelectField must be non-null and contain options.");
                }
                bmqf bmqf29 = selectFieldView.f152195g;
                if (bmqf29.f130373b == 7) {
                    bmpl2 = (bmpl) bmqf29.f130374c;
                } else {
                    bmpl2 = bmpl.f130314g;
                }
                int a7 = bmpj.m108255a(bmpl2.f130320e);
                if (a7 == 0 || a7 == 1) {
                    Log.w("SelectFieldView", String.format(Locale.US, "Unknown select field display type for field %s.", selectFieldView.f152195g.f130375d));
                    bmqf bmqf30 = selectFieldView.f152195g;
                    if (bmqf30.f130373b == 7) {
                        bmpl5 = (bmpl) bmqf30.f130374c;
                    } else {
                        bmpl5 = bmpl.f130314g;
                    }
                    bxvd bxvd7 = (bxvd) bmpl5.mo74142c(5);
                    bxvd7.mo73625a((GeneratedMessageLite) bmpl5);
                    if (bxvd7.f164950c) {
                        bxvd7.mo74035c();
                        bxvd7.f164950c = false;
                    }
                    bmpl bmpl6 = (bmpl) bxvd7.f164949b;
                    bmpl bmpl7 = bmpl.f130314g;
                    bmpl6.f130320e = 1;
                    bmpl6.f130316a = 4 | bmpl6.f130316a;
                    bmpl = (bmpl) bxvd7.mo74062i();
                    bmqf bmqf31 = selectFieldView.f152195g;
                    bxvd bxvd8 = (bxvd) bmqf31.mo74142c(5);
                    bxvd8.mo73625a((GeneratedMessageLite) bmqf31);
                    if (bxvd8.f164950c) {
                        bxvd8.mo74035c();
                        bxvd8.f164950c = false;
                    }
                    bmqf bmqf32 = (bmqf) bxvd8.f164949b;
                    bmqf bmqf33 = bmqf.f130370r;
                    bmpl.getClass();
                    bmqf32.f130374c = bmpl;
                    bmqf32.f130373b = 7;
                    selectFieldView.f152195g = (bmqf) bxvd8.mo74062i();
                }
                if (bkft.m105640a(bmqf27) || bmqf27.f130379h) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                selectFieldView.f152198j = bkft.m105627a(bmpl);
                selectFieldView.f152199k = bkft.m105643b(bmpl);
                if (z3) {
                    if (bmpl.f130317b.size() > 1 && selectFieldView.f152198j < 0) {
                        throw new IllegalArgumentException("Read-only field does not have clear indication of which option to display.");
                    }
                    int a8 = bmpj.m108255a(bmpl.f130320e);
                    if (a8 != 0 && a8 == 2) {
                        TextView textView3 = selectFieldView.f152193e;
                        selectFieldView.f152194f = textView3;
                        textView3.setVisibility(0);
                        selectFieldView.f152189a.setVisibility(8);
                        selectFieldView.f152190b.setVisibility(8);
                        bmpk bmpk = (bmpk) bmpl.f130317b.get(selectFieldView.f152198j);
                        selectFieldView.f152193e.setText(bkft.m105633a(bmpk));
                        InfoMessageView infoMessageView = selectFieldView.f152191c;
                        bmnr bmnr2 = bmpk.f130309j;
                        if (bmnr2 == null) {
                            bmnr2 = bmnr.f130153o;
                        }
                        infoMessageView.mo72003a(bmnr2);
                        if ((bmpk.f130300a & 512) != 0) {
                            bmno bmno = bmpk.f130310k;
                            if (bmno == null) {
                                bmno = bmno.f130138m;
                            }
                            if (bmno.f130142c.isEmpty()) {
                                String str3 = bmqf27.f130375d;
                                String valueOf = String.valueOf(bkft.m105633a(bmpk));
                                throw new IllegalArgumentException(bkfr.m105591b(str3, valueOf.length() == 0 ? new String("Empty option icon url for option: ") : "Empty option icon url for option: ".concat(valueOf)));
                            }
                            selectFieldView.f152192d.setVisibility(0);
                            ImageWithCaptionView imageWithCaptionView = selectFieldView.f152192d;
                            bmno bmno2 = bmpk.f130310k;
                            if (bmno2 == null) {
                                bmno2 = bmno.f130138m;
                            }
                            imageWithCaptionView.mo71993a(bmno2, b, ((Boolean) bjwd.f123461a.mo54082a()).booleanValue(), logContext);
                            view2 = inflate2;
                        } else {
                            view2 = inflate2;
                        }
                        bkfu = this;
                        view = view2;
                    }
                }
                int a9 = bmpj.m108255a(bmpl.f130320e);
                if (a9 != 0 && a9 == 2) {
                    FormSpinner formSpinner = selectFieldView.f152189a;
                    selectFieldView.f152194f = formSpinner;
                    formSpinner.setVisibility(0);
                    selectFieldView.f152189a.mo71969a(bmqf27.f130376e);
                    FormSpinner formSpinner2 = selectFieldView.f152189a;
                    String str4 = bmqf27.f130375d;
                    formSpinner2.f152055i = str4;
                    formSpinner2.f152057k.f123260c = str4;
                    formSpinner2.mo71971a(logContext);
                    selectFieldView.f152190b.setVisibility(8);
                    selectFieldView.f152192d.setVisibility(8);
                    selectFieldView.f152193e.setVisibility(8);
                    if (bmqf27.f130373b == 7) {
                        bmpl3 = (bmpl) bmqf27.f130374c;
                    } else {
                        bmpl3 = bmpl.f130314g;
                    }
                    if (bkft.m105627a(bmpl3) < 0) {
                        if (bmqf27.f130373b == 7) {
                            bmpl4 = (bmpl) bmqf27.f130374c;
                        } else {
                            bmpl4 = bmpl.f130314g;
                        }
                        z4 = bmpl4.f130319d.isEmpty() ? !bmqf27.f130380i.isEmpty() : true;
                    } else {
                        z4 = false;
                    }
                    selectFieldView.f152196h = z4;
                    ArrayList arrayList = new ArrayList(bmpl.f130317b.size());
                    bxwc bxwc2 = bmpl.f130317b;
                    int size = bxwc2.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        bmpk bmpk2 = (bmpk) bxwc2.get(i11);
                        arrayList.add(new bkfs(bmpk2.f130306g, bmpk2.f130307h.getKey(), bkft.m105633a(bmpk2)));
                    }
                    if (selectFieldView.f152196h) {
                        byte[] bArr = new byte[0];
                        if (!bmpl.f130319d.isEmpty()) {
                            str = bmpl.f130319d;
                        } else {
                            str = bmqf27.f130380i;
                        }
                        arrayAdapter = new bkak(selectFieldView.getContext(), arrayList, new bkfs("", bArr, str));
                    } else {
                        arrayAdapter = new bkfz(selectFieldView.getContext(), arrayList);
                    }
                    arrayAdapter.setDropDownViewResource(C0126R.C0128layout.view_spinner_dropdown);
                    selectFieldView.f152189a.setAdapter((SpinnerAdapter) arrayAdapter);
                    selectFieldView.f152189a.setOnItemSelectedListener(selectFieldView);
                    FormSpinner formSpinner3 = selectFieldView.f152189a;
                    formSpinner3.f152063q = selectFieldView;
                    formSpinner3.f152064r = selectFieldView;
                    int i12 = selectFieldView.f152198j;
                    if (i12 == -1 && !selectFieldView.f152196h) {
                        selectFieldView.f152198j = 0;
                    } else {
                        i4 = i12;
                    }
                    selectFieldView.f152197i = i4;
                    selectFieldView.mo72084a(i4);
                    FormSpinner formSpinner4 = selectFieldView.f152189a;
                    bmqf bmqf34 = selectFieldView.f152195g;
                    formSpinner4.f152060n = !bmqf34.f130378g;
                    formSpinner4.setPrompt(bmqf34.f130380i);
                    selectFieldView.f152189a.f152061o = selectFieldView.f152195g.f130380i;
                    view2 = inflate2;
                    bkfu = this;
                    view = view2;
                } else {
                    int a10 = bmpj.m108255a(bmpl.f130320e);
                    if (a10 == 0) {
                        a10 = 1;
                    }
                    int i13 = a10 - 1;
                    if (i13 == 2 || i13 == 6 || i13 == 7 || i13 == 8) {
                        InlineSelectView inlineSelectView = selectFieldView.f152190b;
                        selectFieldView.f152194f = inlineSelectView;
                        inlineSelectView.setVisibility(0);
                        selectFieldView.f152189a.setVisibility(8);
                        selectFieldView.f152192d.setVisibility(8);
                        selectFieldView.f152193e.setVisibility(8);
                        InlineSelectView inlineSelectView2 = selectFieldView.f152190b;
                        inlineSelectView2.f152101a = selectFieldView;
                        inlineSelectView2.f152109i = selectFieldView;
                        inlineSelectView2.f152110j = selectFieldView;
                        long j = bmqf27.f130376e;
                        String str5 = bmqf27.f130375d;
                        inlineSelectView2.f152108h = bmpl;
                        inlineSelectView2.removeAllViews();
                        if (inlineSelectView2.f152108h == null) {
                            view2 = inflate2;
                        } else {
                            LayoutInflater from = LayoutInflater.from(inlineSelectView2.getContext());
                            bxwc bxwc3 = inlineSelectView2.f152108h.f130317b;
                            int i14 = 0;
                            for (int size2 = bxwc3.size(); i14 < size2; size2 = i3) {
                                bmpk bmpk3 = (bmpk) bxwc3.get(i14);
                                int a11 = bmpj.m108255a(bmpl.f130320e);
                                if (a11 == 0) {
                                    a11 = 1;
                                }
                                int i15 = a11 - 1;
                                View view4 = inflate2;
                                if (i15 == 6) {
                                    bxwc = bxwc3;
                                    i3 = size2;
                                    View inflate3 = from.inflate((int) C0126R.C0128layout.view_row_inline_multi_select_field, (ViewGroup) inlineSelectView2, false);
                                    String a12 = bkft.m105633a(bmpk3);
                                    inflate3.setContentDescription(a12);
                                    ((TextView) inflate3.findViewById(C0126R.C0129id.description)).setText(a12);
                                    view3 = inflate3;
                                } else if (i15 == 7) {
                                    bxwc = bxwc3;
                                    i3 = size2;
                                    View inflate4 = from.inflate((int) C0126R.C0128layout.view_row_radio_button_field, (ViewGroup) inlineSelectView2, false);
                                    inflate4.setContentDescription(bkft.m105633a(bmpk3));
                                    ((TextView) inflate4.findViewById(C0126R.C0129id.description)).setText(bkft.m105633a(bmpk3));
                                    if ((bmpk3.f130300a & 8) != 0) {
                                        InfoMessageView infoMessageView2 = (InfoMessageView) inflate4.findViewById(C0126R.C0129id.sub_value);
                                        bmnr bmnr3 = bmpk3.f130304e;
                                        if (bmnr3 == null) {
                                            bmnr3 = bmnr.f130153o;
                                        }
                                        infoMessageView2.mo72006b(bmnr3);
                                    }
                                    view3 = inflate4;
                                } else if (i15 != 8) {
                                    view3 = from.inflate((int) C0126R.C0128layout.view_row_inline_select_field, (ViewGroup) inlineSelectView2, false);
                                    view3.setContentDescription(bkft.m105633a(bmpk3));
                                    bxwc = bxwc3;
                                    ((TextView) view3.findViewById(C0126R.C0129id.description)).setText(bkft.m105633a(bmpk3));
                                    bkfr.m105572a((ImageView) view3.findViewById(C0126R.C0129id.selection_indicator), bkfr.m105588b(inlineSelectView2.getContext()));
                                    if ((bmpk3.f130300a & 512) != 0) {
                                        ImageWithCaptionView imageWithCaptionView2 = (ImageWithCaptionView) view3.findViewById(C0126R.C0129id.icon);
                                        imageWithCaptionView2.setVisibility(0);
                                        imageWithCaptionView2.mo71891b();
                                        bmno bmno3 = bmpk3.f130310k;
                                        if (bmno3 == null) {
                                            bmno3 = bmno.f130138m;
                                        }
                                        i3 = size2;
                                        imageWithCaptionView2.mo71993a(bmno3, b, ((Boolean) bjwd.f123461a.mo54082a()).booleanValue(), logContext);
                                    } else {
                                        i3 = size2;
                                    }
                                    if ((bmpk3.f130300a & 8) != 0) {
                                        InfoMessageView infoMessageView3 = (InfoMessageView) view3.findViewById(C0126R.C0129id.sub_value);
                                        bmnr bmnr4 = bmpk3.f130304e;
                                        if (bmnr4 == null) {
                                            bmnr4 = bmnr.f130153o;
                                        }
                                        infoMessageView3.mo72006b(bmnr4);
                                    }
                                } else {
                                    bxwc = bxwc3;
                                    i3 = size2;
                                    view3 = from.inflate((int) C0126R.C0128layout.view_row_inline_select_field_without_select_indicator, (ViewGroup) inlineSelectView2, false);
                                    view3.setContentDescription(bkft.m105633a(bmpk3));
                                    TextView textView4 = (TextView) view3.findViewById(C0126R.C0129id.description);
                                    textView4.setText(bkft.m105633a(bmpk3));
                                    if ((bmpk3.f130300a & 512) != 0) {
                                        ImageWithCaptionView imageWithCaptionView3 = (ImageWithCaptionView) view3.findViewById(C0126R.C0129id.icon);
                                        imageWithCaptionView3.setVisibility(0);
                                        imageWithCaptionView3.mo71891b();
                                        bmno bmno4 = bmpk3.f130310k;
                                        if (bmno4 == null) {
                                            bmno4 = bmno.f130138m;
                                        }
                                        imageWithCaptionView3.mo71993a(bmno4, b, ((Boolean) bjwd.f123461a.mo54082a()).booleanValue(), logContext);
                                    }
                                    if ((bmpk3.f130300a & 8) == 0) {
                                        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) textView4.getLayoutParams();
                                        layoutParams3.addRule(6, 0);
                                        layoutParams3.addRule(15);
                                    } else {
                                        InfoMessageView infoMessageView4 = (InfoMessageView) view3.findViewById(C0126R.C0129id.sub_value);
                                        bmnr bmnr5 = bmpk3.f130304e;
                                        if (bmnr5 == null) {
                                            bmnr5 = bmnr.f130153o;
                                        }
                                        infoMessageView4.mo72006b(bmnr5);
                                    }
                                }
                                inlineSelectView2.addView(view3);
                                C1280ps.m19894a(view3, inlineSelectView2.f152102b);
                                i14++;
                                inflate2 = view4;
                                bxwc3 = bxwc;
                            }
                            view2 = inflate2;
                            inlineSelectView2.setEnabled(true);
                            if (!InlineSelectView.m118617a(inlineSelectView2.f152108h)) {
                                inlineSelectView2.mo72017a(bkft.m105627a(inlineSelectView2.f152108h), false);
                            } else {
                                inlineSelectView2.f152106f = new boolean[bmpl.f130317b.size()];
                                inlineSelectView2.setShowDividers(0);
                                inlineSelectView2.mo72018a(bkft.m105643b(inlineSelectView2.f152108h), false);
                            }
                        }
                        bjsv bjsv = inlineSelectView2.f152103c;
                        bjsv.f123259b = j;
                        bjsv.f123260c = str5;
                        bjsv.f123258a = logContext;
                        selectFieldView.f152190b.f152104d = !selectFieldView.f152195g.f130378g;
                        bkfu = this;
                        view = view2;
                    } else {
                        int a13 = bmpj.m108255a(bmpl.f130320e);
                        int i16 = a13 == 0 ? 1 : a13;
                        StringBuilder sb = new StringBuilder(45);
                        sb.append("Unknown SelectField display type: ");
                        sb.append(i16 - 1);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            } else if (i5 == 10) {
                if (bmqf2.f130380i.isEmpty()) {
                    bkfu = this;
                    bmqf bmqf35 = bkfu.f124170i;
                    if (bmqf35.f130373b == 10) {
                        bmow = (bmow) bmqf35.f130374c;
                    } else {
                        bmow = bmow.f130264f;
                    }
                    if ((bmow.f130266a & 1) == 0) {
                        throw new IllegalArgumentException(bkfr.m105591b(bkfu.f124170i.f130375d, "Checkbox field must have a label."));
                    }
                } else {
                    bkfu = this;
                }
                View inflate5 = bkfu.f124171j.inflate((int) C0126R.C0128layout.view_checkbox, bkfu.f124172k, false);
                ((CheckboxView) inflate5).mo71869a(bkfu.f124170i);
                view = inflate5;
            } else {
                bkfu = this;
                if (i5 == 13) {
                    bmpf bmpf = (bmpf) bmqf2.f130374c;
                    if ((bmpf.f130293a & 2) != 0) {
                        LayoutInflater layoutInflater = bkfu.f124171j;
                        bmnr bmnr6 = bmpf.f130295c;
                        if (bmnr6 == null) {
                            bmnr = bmnr.f130153o;
                        } else {
                            bmnr = bmnr6;
                        }
                        view = bkfr.m105549a(layoutInflater, bmnr, b, bkfu.f124172k, bkfu.f124173l, ((Boolean) bjwd.f123461a.mo54082a()).booleanValue(), bkfu.f124167f);
                    } else {
                        view = bkft.m105628a(bmqf2, bkfu.f124171j, bkfu.f124172k);
                    }
                } else if (i5 == 30) {
                    CountDownTextView countDownTextView = (CountDownTextView) bkfu.f124171j.inflate((int) C0126R.C0128layout.view_countdown_textview, bkfu.f124172k, false);
                    if (bmqf2.f130373b == 30) {
                        bmoz = (bmoz) bmqf2.f130374c;
                    } else {
                        bmoz = bmoz.f130272c;
                    }
                    countDownTextView.f151930c = bmoz;
                    view = countDownTextView;
                } else {
                    throw new IllegalArgumentException(String.format(Locale.US, "UiField is not supported: %s", bkfu.f124170i.toString()));
                }
            }
        }
        view.setId(bkfu.f124173l.mo65614a());
        bkfu.m105647a(view);
        bmqf bmqf36 = bkfu.f124170i;
        if ((bmqf36.f130372a & 128) != 0) {
            if (bkfu.f124165d != null) {
                bkfl bkfl = new bkfl(bkfu.f124171j.getContext());
                bkfl.mo65961a(view, bkfu.f124170i, b);
                bkfl.f124143a = bkfu.f124165d;
                bkfl.setId(bkfu.f124173l.mo65614a());
                bkfu.m105647a(bkfl);
                return bkfl;
            }
            throw new IllegalArgumentException(bkfr.m105591b(bmqf36.f130375d, "An OnTooltipIconClickListener is required if the UI field has a tooltip."));
        } else if (bmqf36.f130373b != 6 || bmqf36.f130383l.size() <= 0 || (a = bmph.m108253a(bkfu.f124170i.f130384m)) == 0 || a != 3) {
            return view;
        } else {
            bkec bkec = new bkec(bkfu.f124171j.getContext());
            bkec.mo65885a(view, bkfu.f124170i, b);
            bkfu.m105647a(bkec);
            return bkec;
        }
    }
}
