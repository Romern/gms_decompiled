package p000;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.wallet.p097ui.common.CheckboxView;
import com.google.android.wallet.p097ui.common.CountDownTextView;
import com.google.android.wallet.p097ui.common.DateEditText;
import com.google.android.wallet.p097ui.common.FormEditText;
import com.google.android.wallet.p097ui.common.FormSpinner;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import com.google.android.wallet.p097ui.common.InlineSelectView;
import com.google.android.wallet.p097ui.common.LinkView;
import com.google.android.wallet.p097ui.common.WebViewLayout;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: bkft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkft {
    /* renamed from: a */
    public static int m105627a(bmpl bmpl) {
        if (bmpl.f130318c.isEmpty()) {
            return bmpl.f130317b.size() != 1 ? -1 : 0;
        }
        int size = bmpl.f130317b.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (bmpl.f130318c.equals(((bmpk) bmpl.f130317b.get(i)).f130306g)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i != -1) {
            return i;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "No option that matches value %s.", bmpl.f130318c));
    }

    /* renamed from: b */
    public static View m105641b(View view) {
        return view instanceof bkdd ? m105641b(((bkdd) view).mo65860b()) : view;
    }

    /* renamed from: c */
    public static String m105644c(bmqf bmqf) {
        String str;
        bmpl bmpl;
        bmpe bmpe;
        bmpe bmpe2;
        bmpe bmpe3;
        int i = bmqf.f130373b;
        String str2 = "";
        if (i == 16) {
            bmpe bmpe4 = (bmpe) bmqf.f130374c;
            int i2 = 1;
            if ((bmpe4.f130281a & 8) == 0) {
                if ((bmqf.f130372a & 1) != 0) {
                    str2 = bmqf.f130375d;
                }
                throw new IllegalArgumentException(bkfr.m105591b(str2, "Read only DateField has no initial value."));
            }
            blxc blxc = bmpe4.f130285e;
            if (blxc == null) {
                blxc = blxc.f128037e;
            }
            if (bmqf.f130373b == 16) {
                bmpe = (bmpe) bmqf.f130374c;
            } else {
                bmpe = bmpe.f130279k;
            }
            String str3 = bmpe.f130289i;
            if (bmqf.f130373b == 16) {
                bmpe2 = (bmpe) bmqf.f130374c;
            } else {
                bmpe2 = bmpe.f130279k;
            }
            int a = bmpd.m108249a(bmpe2.f130282b);
            if (a != 0) {
                i2 = a;
            }
            if (bmqf.f130373b == 16) {
                bmpe3 = (bmpe) bmqf.f130374c;
            } else {
                bmpe3 = bmpe.f130279k;
            }
            str = new bjvf(str3, i2, bmpe3.f130290j).mo65561a(blxc.f128042d, blxc.f128041c, blxc.f128040b);
        } else if (i == 7) {
            int a2 = m105627a((bmpl) bmqf.f130374c);
            if (a2 < 0) {
                return str2;
            }
            if (bmqf.f130373b == 7) {
                bmpl = (bmpl) bmqf.f130374c;
            } else {
                bmpl = bmpl.f130314g;
            }
            return m105633a((bmpk) bmpl.f130317b.get(a2));
        } else if (i == 6 || i == 13) {
            str = (String) m105642b(bmqf);
        } else {
            throw new IllegalArgumentException(bkfr.m105591b(bmqf.f130375d, "UiField is not supported"));
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(bkfr.m105591b(bmqf.f130375d, "Read only UiField has no initial value"));
    }

    /* renamed from: d */
    static boolean m105646d(View view) {
        if (view == null) {
            return false;
        }
        if ((view instanceof bkbn) || (view instanceof ImageWithCaptionView) || (view instanceof bkjr) || (view instanceof WebViewLayout)) {
            return true;
        }
        Integer num = 16;
        return num.equals(view.getTag(C0126R.C0129id.field_type));
    }

    /* renamed from: b */
    public static Object m105642b(bmqf bmqf) {
        bmpl bmpl;
        int i = bmqf.f130373b;
        if (i == 6) {
            return ((bmqe) bmqf.f130374c).f130362k;
        }
        if (i == 16) {
            blxc blxc = ((bmpe) bmqf.f130374c).f130285e;
            return blxc == null ? blxc.f128037e : blxc;
        } else if (i == 7) {
            int a = m105627a((bmpl) bmqf.f130374c);
            if (a < 0) {
                return "";
            }
            if (bmqf.f130373b == 7) {
                bmpl = (bmpl) bmqf.f130374c;
            } else {
                bmpl = bmpl.f130314g;
            }
            return ((bmpk) bmpl.f130317b.get(a)).f130306g;
        } else if (i == 10) {
            bmqh a2 = bmqh.m108281a(((bmow) bmqf.f130374c).f130268c);
            return a2 == null ? bmqh.UNKNOWN : a2;
        } else if (i == 13) {
            return ((bmpf) bmqf.f130374c).f130294b;
        } else {
            if (i == 30) {
                return String.valueOf(((bmoz) bmqf.f130374c).f130274a);
            }
            String valueOf = String.valueOf(bmqf);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("UiField is not supported: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public static TextView m105628a(bmqf bmqf, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        TextView textView = (TextView) layoutInflater.inflate((int) C0126R.C0128layout.view_form_non_editable_text, viewGroup, false);
        textView.setText(m105644c(bmqf));
        return textView;
    }

    /* renamed from: a */
    public static bmqf m105629a(bmqf bmqf, FormEditText formEditText) {
        return m105630a(bmqf, formEditText, (Activity) null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.wallet.ui.common.DateEditText.a(bmnn, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.String, int):java.lang.String
      com.google.android.wallet.ui.common.FormEditText.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.FormEditText.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(bmnn, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(int, int):boolean
      bkdf.a(java.lang.CharSequence, boolean):void
      bjwm.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(bkce, bkdf, boolean):void
     arg types: [com.google.android.wallet.ui.common.DateEditText, com.google.android.wallet.ui.common.DateEditText, int]
     candidates:
      com.google.android.wallet.ui.common.DateEditText.a(int, int, int):void
      com.google.android.wallet.ui.common.DateEditText.a(int, java.lang.String, java.lang.String):void
      com.google.android.wallet.ui.common.DateEditText.a(java.lang.String, java.lang.String, int):void
      com.google.android.wallet.ui.common.FormEditText.a(int, int, int):void
      com.google.android.wallet.ui.common.FormEditText.a(bkce, bkdf, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.String, int):java.lang.String
      com.google.android.wallet.ui.common.FormEditText.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.FormEditText.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(bmnn, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(int, int):boolean
      bkdf.a(java.lang.CharSequence, boolean):void
      bjwm.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkfr.a(com.google.android.chimera.Activity, android.widget.TextView):boolean
     arg types: [com.google.android.chimera.Activity, com.google.android.wallet.ui.common.FormEditText]
     candidates:
      bkfr.a(android.content.Context, int):int
      bkfr.a(android.view.View, android.view.View):int
      bkfr.a(android.content.Context, java.lang.String):android.content.Intent
      bkfr.a(android.content.res.Resources, java.util.List):java.lang.String
      bkfr.a(java.lang.String, java.lang.String):java.lang.String
      bkfr.a(android.content.Context, android.view.View):void
      bkfr.a(android.content.Context, android.widget.Button):void
      bkfr.a(android.view.View, int):void
      bkfr.a(android.view.View, android.util.TypedValue):void
      bkfr.a(android.view.View, java.lang.CharSequence):void
      bkfr.a(android.view.View, boolean):void
      bkfr.a(android.view.ViewGroup, int):void
      bkfr.a(android.view.ViewGroup, boolean):void
      bkfr.a(android.widget.ImageView, android.content.res.ColorStateList):void
      bkfr.a(android.widget.TextView, java.lang.String):void
      bkfr.a(android.widget.TextView, boolean):void
      bkfr.a(boolean, java.lang.Object):void
      bkfr.a(android.content.Context, bmap):boolean
      bkfr.a(android.content.Context, int[]):boolean
      bkfr.a(com.google.android.chimera.Activity, android.widget.TextView):boolean */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x042b  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0441  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x045e  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0475  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x04ba  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x04cf  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x04d5  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x04ea  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x04f0  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x04f3  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x057d  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0582  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x058c  */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x07ef  */
    /* JADX WARNING: Removed duplicated region for block: B:446:0x07fe  */
    /* renamed from: a */
    public static bmqf m105630a(bmqf bmqf, FormEditText formEditText, Activity activity) {
        String str;
        String str2;
        String str3;
        boolean z;
        boolean z2;
        int a;
        int i;
        int i2;
        int a2;
        int i3;
        bmqe bmqe;
        int size;
        int a3;
        String str4;
        bkhg bkhg;
        double d;
        int i4;
        int a4;
        int i5;
        double d2;
        String str5;
        bmqe bmqe2;
        bmqe bmqe3;
        bmnl bmnl;
        int a5;
        String str6;
        bmnn bmnn;
        bmnn bmnn2;
        bmnn bmnn3;
        bmpe bmpe;
        bmpe bmpe2;
        bmpe bmpe3;
        bmpe bmpe4;
        bmpe bmpe5;
        bmpe bmpe6;
        bmpe bmpe7;
        bmpe bmpe8;
        bmpe bmpe9;
        bmpe bmpe10;
        bmpe bmpe11;
        bmpe bmpe12;
        bmpe bmpe13;
        bmpe bmpe14;
        bmpe bmpe15;
        bmpe bmpe16;
        bmqf bmqf2 = bmqf;
        FormEditText formEditText2 = formEditText;
        formEditText2.mo71914a(bmqf2.f130376e);
        int i6 = bmqf2.f130372a;
        String str7 = "";
        if ((i6 & 1) != 0) {
            str = bmqf2.f130375d;
        } else {
            str = str7;
        }
        formEditText2.f152005ac = str;
        formEditText2.f152009ag.f123260c = str;
        if ((i6 & 32) != 0) {
            str2 = bmqf2.f130380i;
        } else {
            str2 = str7;
        }
        formEditText2.setHint(str2);
        int i7 = 1;
        formEditText2.mo71928b(!bmqf2.f130378g);
        formEditText2.mo71931c(!bmqf2.f130379h);
        if ((bmqf2.f130372a & 64) != 0) {
            str3 = bmqf2.f130381j;
        } else {
            str3 = str7;
        }
        formEditText2.mo71920a((CharSequence) str3);
        int i8 = bmqf2.f130373b;
        int i9 = 2;
        int i10 = 3;
        if (i8 == 16) {
            if (!bmqf2.f130379h || (((bmpe) bmqf2.f130374c).f130281a & 8) != 0) {
                DateEditText dateEditText = (DateEditText) formEditText2;
                int a6 = bmpd.m108249a(((bmpe) bmqf2.f130374c).f130282b);
                if (a6 == 0) {
                    a6 = 1;
                }
                if (bmqf2.f130373b == 16) {
                    bmpe = (bmpe) bmqf2.f130374c;
                } else {
                    bmpe = bmpe.f130279k;
                }
                String str8 = bmpe.f130289i;
                if (bmqf2.f130373b == 16) {
                    bmpe2 = (bmpe) bmqf2.f130374c;
                } else {
                    bmpe2 = bmpe.f130279k;
                }
                dateEditText.mo71881a(a6, str8, bmpe2.f130290j);
                if (bmqf2.f130373b == 16) {
                    bmpe3 = (bmpe) bmqf2.f130374c;
                } else {
                    bmpe3 = bmpe.f130279k;
                }
                int a7 = bmpd.m108249a(bmpe3.f130282b);
                if (a7 != 0 && a7 == 3) {
                    if (bmqf2.f130373b == 16) {
                        bmpe12 = (bmpe) bmqf2.f130374c;
                    } else {
                        bmpe12 = bmpe.f130279k;
                    }
                    blxc blxc = bmpe12.f130283c;
                    if (blxc == null) {
                        blxc = blxc.f128037e;
                    }
                    if (bmqf2.f130373b == 16) {
                        bmpe13 = (bmpe) bmqf2.f130374c;
                    } else {
                        bmpe13 = bmpe.f130279k;
                    }
                    blxc blxc2 = bmpe13.f130284d;
                    if (blxc2 == null) {
                        blxc2 = blxc.f128037e;
                    }
                    dateEditText.mo65972a((bkgj) new bkdc(dateEditText, blxc, blxc2));
                    if (bmqf2.f130373b == 16) {
                        bmpe14 = (bmpe) bmqf2.f130374c;
                    } else {
                        bmpe14 = bmpe.f130279k;
                    }
                    if ((bmpe14.f130281a & 8) != 0) {
                        if (bmqf2.f130373b == 16) {
                            bmpe15 = (bmpe) bmqf2.f130374c;
                        } else {
                            bmpe15 = bmpe.f130279k;
                        }
                        blxc blxc3 = bmpe15.f130285e;
                        if (blxc3 == null) {
                            blxc3 = blxc.f128037e;
                        }
                        String num = Integer.toString(blxc3.f128041c);
                        if (bmqf2.f130373b == 16) {
                            bmpe16 = (bmpe) bmqf2.f130374c;
                        } else {
                            bmpe16 = bmpe.f130279k;
                        }
                        blxc blxc4 = bmpe16.f130285e;
                        if (blxc4 == null) {
                            blxc4 = blxc.f128037e;
                        }
                        dateEditText.mo71883a(num, Integer.toString(blxc4.f128040b), 6);
                    }
                } else {
                    if (bmqf2.f130373b == 16) {
                        bmpe4 = (bmpe) bmqf2.f130374c;
                    } else {
                        bmpe4 = bmpe.f130279k;
                    }
                    int a8 = bmpd.m108249a(bmpe4.f130282b);
                    if (a8 != 0 && a8 == 2) {
                        if (bmqf2.f130373b == 16) {
                            bmpe6 = (bmpe) bmqf2.f130374c;
                        } else {
                            bmpe6 = bmpe.f130279k;
                        }
                        blxc blxc5 = bmpe6.f130283c;
                        if (blxc5 == null) {
                            blxc5 = blxc.f128037e;
                        }
                        if (bmqf2.f130373b == 16) {
                            bmpe7 = (bmpe) bmqf2.f130374c;
                        } else {
                            bmpe7 = bmpe.f130279k;
                        }
                        blxc blxc6 = bmpe7.f130284d;
                        if (blxc6 == null) {
                            blxc6 = blxc.f128037e;
                        }
                        dateEditText.mo65972a((bkgj) new bkcl(dateEditText, blxc5, blxc6));
                        if (bmqf2.f130373b == 16) {
                            bmpe8 = (bmpe) bmqf2.f130374c;
                        } else {
                            bmpe8 = bmpe.f130279k;
                        }
                        if ((bmpe8.f130281a & 8) != 0) {
                            if (bmqf2.f130373b == 16) {
                                bmpe9 = (bmpe) bmqf2.f130374c;
                            } else {
                                bmpe9 = bmpe.f130279k;
                            }
                            blxc blxc7 = bmpe9.f130285e;
                            if (blxc7 == null) {
                                blxc7 = blxc.f128037e;
                            }
                            String num2 = Integer.toString(blxc7.f128041c);
                            if (bmqf2.f130373b == 16) {
                                bmpe10 = (bmpe) bmqf2.f130374c;
                            } else {
                                bmpe10 = bmpe.f130279k;
                            }
                            blxc blxc8 = bmpe10.f130285e;
                            if (blxc8 == null) {
                                blxc8 = blxc.f128037e;
                            }
                            String num3 = Integer.toString(blxc8.f128042d);
                            if (bmqf2.f130373b == 16) {
                                bmpe11 = (bmpe) bmqf2.f130374c;
                            } else {
                                bmpe11 = bmpe.f130279k;
                            }
                            blxc blxc9 = bmpe11.f130285e;
                            if (blxc9 == null) {
                                blxc9 = blxc.f128037e;
                            }
                            String num4 = Integer.toString(blxc9.f128040b);
                            if (dateEditText.f151944m == 2) {
                                dateEditText.f151934c = num3;
                                dateEditText.f151935d = num2;
                                dateEditText.f151936e = num4;
                                dateEditText.mo71832a((CharSequence) dateEditText.mo71885j(), 6);
                            } else {
                                throw new IllegalArgumentException("Setting the is day only supported for DateField.YEAR_MONTH_DAY");
                            }
                        }
                    } else {
                        String str9 = bmqf2.f130375d;
                        Locale locale = Locale.US;
                        Object[] objArr = new Object[1];
                        if (bmqf2.f130373b == 16) {
                            bmpe5 = (bmpe) bmqf2.f130374c;
                        } else {
                            bmpe5 = bmpe.f130279k;
                        }
                        int a9 = bmpd.m108249a(bmpe5.f130282b);
                        if (a9 != 0) {
                            i7 = a9;
                        }
                        objArr[0] = Integer.valueOf(i7 - 1);
                        throw new IllegalArgumentException(bkfr.m105591b(str9, String.format(locale, "DateField.Type %s not supported", objArr)));
                    }
                }
                dateEditText.mo71917a((bkce) dateEditText, (bkdf) dateEditText, true);
            } else {
                if ((bmqf2.f130372a & 1) != 0) {
                    str7 = bmqf2.f130375d;
                }
                throw new IllegalArgumentException(bkfr.m105591b(str7, "Disabled field must have an initial value."));
            }
        } else if (i8 == 6) {
            bmqe bmqe4 = (bmqe) bmqf2.f130374c;
            int a10 = bmps.m108264a(bmqe4.f130369r);
            if (a10 == 0) {
                z = false;
            } else {
                z = a10 == 3;
            }
            formEditText2.f151984D = z;
            int i11 = bmqe4.f130354b;
            if (i11 == 13) {
                bmnl bmnl2 = (bmnl) bmqe4.f130355c;
                bkeq bkeq = formEditText2.f152000T;
                if (bkeq == null || !bkeq.f124099a.equals(bmnl2)) {
                    if (bmnl2 == null) {
                        formEditText2.f152000T = null;
                        formEditText2.f152038u = null;
                        formEditText2.setFilters(FormEditText.f151979aa);
                    } else if (formEditText2.f151999S != null) {
                        throw new IllegalArgumentException("Cannot set schemes for both number formatting and template formatting.");
                    } else if (formEditText2.f151986F > 0 || formEditText2.f152003W != null) {
                        throw new IllegalArgumentException("Min/max length shouldn't be used with a number formatting scheme since we are using formatted numeric values.");
                    } else {
                        formEditText2.f152000T = new bkeq(bmnl2);
                        formEditText2.setFilters(new InputFilter[]{formEditText2.f152000T});
                        formEditText2.f152038u = formEditText2.f152011ai;
                    }
                }
            } else if (i11 == 14) {
                int a11 = bmpu.m108266a(bmqe4.f130359g);
                if (a11 != 0 && a11 == 2) {
                    if ((bmqf2.f130372a & 1) != 0) {
                        str7 = bmqf2.f130375d;
                    }
                    throw new IllegalArgumentException(bkfr.m105591b(str7, "Templates with TEXT keyboards are not supported"));
                }
                if (bmqe4.f130354b == 14) {
                    bmnn3 = (bmnn) bmqe4.f130355c;
                } else {
                    bmnn3 = bmnn.f130132e;
                }
                formEditText2.mo71918a(bmnn3);
            }
            int i12 = bmqe4.f130356d;
            int i13 = bmqe4.f130357e;
            int a12 = bmqd.m108277a(bmqe4.f130368q);
            if (a12 == 0) {
                a12 = 1;
            }
            formEditText2.mo71880a(i12, i13, a12);
            if ((bmqf2.f130372a & 64) == 0 || bmqf2.f130381j.isEmpty()) {
                formEditText2.mo71920a((CharSequence) bmqe4.f130358f);
            }
            if (!bmqf2.f130379h) {
                if (bmqf2.f130387p) {
                    if ((bmqf2.f130372a & 128) != 0) {
                        int i14 = Build.VERSION.SDK_INT;
                    }
                    int i15 = bmqe4.f130357e;
                    if (i15 == 0) {
                        TypedArray obtainStyledAttributes = formEditText.getContext().obtainStyledAttributes(new int[]{C0126R.attr.internalUicNonFormFieldTextStartMargin});
                        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
                        obtainStyledAttributes.recycle();
                        formEditText2.setPaddingRelative(dimensionPixelSize, formEditText.getPaddingTop(), dimensionPixelSize, formEditText.getPaddingBottom());
                        i15 = 16;
                    }
                    char c = '0';
                    if (!bmqe4.f130366o) {
                        int a13 = bmpu.m108266a(bmqe4.f130359g);
                        if (a13 == 0 || a13 != 3) {
                            int a14 = bmpu.m108266a(bmqe4.f130359g);
                            if (a14 == 0) {
                                c = 'W';
                            } else if (a14 != 5) {
                                c = 'W';
                            }
                        }
                    } else {
                        c = 8226;
                    }
                    if (bmqe4.f130354b == 14) {
                        StringBuilder sb = new StringBuilder((((bmnn) bmqe4.f130355c).f130135b.size() * 6) - 1);
                        if (bmqe4.f130354b == 14) {
                            bmnn = (bmnn) bmqe4.f130355c;
                        } else {
                            bmnn = bmnn.f130132e;
                        }
                        bxwc bxwc = bmnn.f130135b;
                        int size2 = bxwc.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            bmnm bmnm = (bmnm) bxwc.get(i16);
                            if (sb.length() > 0) {
                                sb.append("|");
                            }
                            sb.append(Pattern.quote(bmnm.f130130b));
                        }
                        if (bmqe4.f130354b == 14) {
                            bmnn2 = (bmnn) bmqe4.f130355c;
                        } else {
                            bmnn2 = bmnn.f130132e;
                        }
                        str6 = bmnn2.f130136c.replaceAll(sb.toString(), String.valueOf(c));
                    } else {
                        char[] cArr = new char[i15];
                        Arrays.fill(cArr, c);
                        str6 = new String(cArr);
                    }
                    TextPaint paint = formEditText.getPaint();
                    int ceil = ((int) Math.ceil((double) Math.max(paint.measureText(str6), paint.measureText(formEditText.getHint().toString())))) + C1280ps.m19925i(formEditText) + C1280ps.m19927j(formEditText);
                    formEditText2.setMinWidth(ceil);
                    formEditText2.setMaxWidth(ceil);
                }
                if (bmqe4.f130366o && ((a5 = bmqa.m108274a(bmqe4.f130363l)) == 0 || a5 != 2)) {
                    int a15 = bmqa.m108274a(bmqe4.f130363l);
                    if (a15 == 0) {
                        z2 = false;
                    } else if (a15 != 1) {
                        z2 = true;
                    }
                    bmpw bmpw = bmpw.UNKNOWN_KEYBOARD_LAYOUT_VARIATION;
                    a = bmpu.m108266a(bmqe4.f130359g);
                    if (a == 0) {
                        a = 1;
                    }
                    i = a - 1;
                    if (i == 2) {
                        i2 = i != 3 ? i != 4 ? !bmqe4.f130366o ? 1 : !z2 ? 129 : 1 : 3 : 33;
                    } else {
                        if (bmqe4.f130366o && !z2) {
                            i9 = 18;
                        }
                        if (bmqe4.f130354b != 14 || !bkfr.m105584a(formEditText)) {
                            i2 = i9;
                        } else {
                            i2 = 1;
                        }
                    }
                    if (m105639a(bmqe4)) {
                        formEditText2.setTextDirection(3);
                    }
                    for (bmpw bmpw2 : new bxvv(bmqe4.f130360h, bmqe.f130350i)) {
                        switch (bmpw2.ordinal()) {
                            case 1:
                            case 5:
                                i2 |= 8192;
                                break;
                            case 2:
                            case 3:
                                i2 |= 4096;
                                break;
                            case 4:
                                i2 |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                                break;
                            case 6:
                                i2 |= 32;
                                break;
                            case 7:
                                i2 |= 96;
                                break;
                            case 8:
                                i2 |= AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
                                break;
                            case 9:
                                i2 |= 16;
                                break;
                            case 10:
                                i2 |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                                break;
                        }
                    }
                    Typeface typeface = formEditText.getTypeface();
                    formEditText2.setInputType(i2);
                    formEditText2.setTypeface(typeface);
                    if (bmqe4.f130354b == 13 && !((bmnl) bmqe4.f130355c).f130123e.isEmpty()) {
                        if (bmqe4.f130354b != 13) {
                            bmnl = (bmnl) bmqe4.f130355c;
                        } else {
                            bmnl = bmnl.f130117h;
                        }
                        String valueOf = String.valueOf(bmnl.f130123e);
                        formEditText2.setKeyListener(new bjzd(valueOf.length() != 0 ? new String("0123456789") : "0123456789".concat(valueOf), i2));
                    }
                    a2 = bmpn.m108259a(bmqf2.f130388q);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    if (a2 - 1 == 5) {
                        i3 = 0;
                    } else {
                        if (bmqf2.f130373b == 6) {
                            bmqe2 = (bmqe) bmqf2.f130374c;
                        } else {
                            bmqe2 = bmqe.f130351s;
                        }
                        if (!bmqe2.f130362k.isEmpty()) {
                            i3 = 0;
                        } else if (bkfr.m105583a(activity, (TextView) formEditText2)) {
                            bxvd bxvd = (bxvd) bmqf2.mo74142c(5);
                            bxvd.mo73625a((bxvk) bmqf2);
                            if (bmqf2.f130373b == 6) {
                                bmqe3 = (bmqe) bmqf2.f130374c;
                            } else {
                                bmqe3 = bmqe.f130351s;
                            }
                            bxvd bxvd2 = (bxvd) bmqe3.mo74142c(5);
                            bxvd2.mo73625a((bxvk) bmqe3);
                            String m = formEditText.mo71937m();
                            if (bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            bmqe bmqe5 = (bmqe) bxvd2.f164949b;
                            m.getClass();
                            bmqe5.f130353a |= 16;
                            bmqe5.f130362k = m;
                            if (!bxvd.f164950c) {
                                i3 = 0;
                            } else {
                                bxvd.mo74035c();
                                i3 = 0;
                                bxvd.f164950c = false;
                            }
                            bmqf bmqf3 = (bmqf) bxvd.f164949b;
                            bmqe bmqe6 = (bmqe) bxvd2.mo74062i();
                            bmqf bmqf4 = bmqf.f130370r;
                            bmqe6.getClass();
                            bmqf3.f130374c = bmqe6;
                            bmqf3.f130373b = 6;
                            bmqf2 = (bmqf) bxvd.mo74062i();
                        } else {
                            i3 = 0;
                        }
                    }
                    if (bmqf2.f130373b != 6) {
                        bmqe = (bmqe) bmqf2.f130374c;
                    } else {
                        bmqe = bmqe.f130351s;
                    }
                    bxwc bxwc2 = bmqe.f130361j;
                    size = bxwc2.size();
                    while (i3 < size) {
                        bmqb bmqb = (bmqb) bxwc2.get(i3);
                        String str10 = bmqb.f130347d;
                        if (!TextUtils.isEmpty(str10)) {
                            if (bmqb.f130345b == 1) {
                                str4 = (String) bmqb.f130346c;
                            } else {
                                str4 = str7;
                            }
                            if (!TextUtils.isEmpty(str4)) {
                                if (bmqb.f130345b == 1) {
                                    str5 = (String) bmqb.f130346c;
                                } else {
                                    str5 = str7;
                                }
                                bkhg = new bkhh(str10, Pattern.compile(str5));
                            } else {
                                if ((bmqb.f130345b == 5 ? ((Double) bmqb.f130346c).doubleValue() : -1.7976931348623157E308d) == -1.7976931348623157E308d) {
                                    if ((bmqb.f130345b == 4 ? ((Double) bmqb.f130346c).doubleValue() : Double.MAX_VALUE) != Double.MAX_VALUE) {
                                        if (bmqb.f130345b == 4) {
                                            d2 = ((Double) bmqb.f130346c).doubleValue();
                                        } else {
                                            d2 = Double.MAX_VALUE;
                                        }
                                        bkhg = new bkhg(d2, Double.POSITIVE_INFINITY, str10);
                                    } else {
                                        if (bmqb.f130345b != i10 || (i4 = bmpq.m108262a(((Integer) bmqb.f130346c).intValue())) == 0) {
                                            i4 = 1;
                                        }
                                        int i17 = i4 - 1;
                                        if (i4 != 0) {
                                            switch (i17) {
                                                case 0:
                                                    bkhg = null;
                                                    break;
                                                case 1:
                                                    bkhg = new bkhd(str10);
                                                    break;
                                                case 2:
                                                    bkhg = new bkgk(str10);
                                                    break;
                                                case 3:
                                                    bkhg = new bkgm(str10);
                                                    break;
                                                case 4:
                                                    bkhg = new bkhj(str10);
                                                    break;
                                                case 5:
                                                    bkhg = new bkgn(str10);
                                                    break;
                                                case 6:
                                                    bkhg = new bkhf(str10);
                                                    break;
                                                case 7:
                                                case 8:
                                                case 9:
                                                case 10:
                                                case 11:
                                                case 12:
                                                case 13:
                                                case 14:
                                                case 15:
                                                case 16:
                                                case 17:
                                                case 18:
                                                case 19:
                                                case 20:
                                                case 21:
                                                    if (bmqb.f130345b != i10 || (i5 = bmpq.m108262a(((Integer) bmqb.f130346c).intValue())) == 0) {
                                                        i5 = 1;
                                                    }
                                                    int i18 = i5 - 1;
                                                    if (i5 != 0) {
                                                        switch (i18) {
                                                            case 7:
                                                                bkhg = new bkgy(str10);
                                                                break;
                                                            case 8:
                                                                bkhg = new bkgp(str10);
                                                                break;
                                                            case 9:
                                                                bkhg = new bkgu(str10);
                                                                break;
                                                            case 10:
                                                                bkhg = new bkgv(str10);
                                                                break;
                                                            case 11:
                                                                bkhg = new bkhc(str10);
                                                                break;
                                                            case 12:
                                                                bkhg = new bkgx(str10);
                                                                break;
                                                            case 13:
                                                                bkhg = new bkgz(str10);
                                                                break;
                                                            case 14:
                                                                bkhg = new bkgw(str10);
                                                                break;
                                                            case 15:
                                                                bkhg = new bkhb(str10);
                                                                break;
                                                            case 16:
                                                                bkhg = new bkgo(str10);
                                                                break;
                                                            case 17:
                                                                bkhg = new bkgq(str10);
                                                                break;
                                                            case 18:
                                                                bkhg = new bkgr(str10);
                                                                break;
                                                            case 19:
                                                                bkhg = new bkgs(str10);
                                                                break;
                                                            case 20:
                                                                bkhg = new bkgt(str10);
                                                                break;
                                                            case 21:
                                                                bkhg = new bkha(str10);
                                                                break;
                                                            default:
                                                                String valueOf2 = String.valueOf(Integer.toString(i18));
                                                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                                                                sb2.append("Checksum type ");
                                                                sb2.append(valueOf2);
                                                                sb2.append(" not supported");
                                                                throw new IllegalArgumentException(sb2.toString());
                                                        }
                                                    } else {
                                                        throw null;
                                                    }
                                                default:
                                                    if (bmqb.f130345b == i10 && (a4 = bmpq.m108262a(((Integer) bmqb.f130346c).intValue())) != 0) {
                                                        i7 = a4;
                                                    }
                                                    int i19 = i7 - 1;
                                                    if (i7 != 0) {
                                                        StringBuilder sb3 = new StringBuilder(51);
                                                        sb3.append("TextField.ChecksumType ");
                                                        sb3.append(i19);
                                                        sb3.append(" is not supported");
                                                        throw new IllegalArgumentException(sb3.toString());
                                                    }
                                                    throw null;
                                            }
                                        } else {
                                            throw null;
                                        }
                                    }
                                } else {
                                    if (bmqb.f130345b == 5) {
                                        d = ((Double) bmqb.f130346c).doubleValue();
                                    } else {
                                        d = -1.7976931348623157E308d;
                                    }
                                    bkhg = new bkhg(Double.NEGATIVE_INFINITY, d, str10);
                                }
                            }
                            if (bkhg != null) {
                                if ((bmqb.f130344a & 32) != 0) {
                                    bwio bwio = bmqb.f130348e;
                                    if (bwio == null) {
                                        bwio = bwio.f159659d;
                                    }
                                    bkhg.f124210c = bwio.f159662b;
                                    bwio bwio2 = bmqb.f130348e;
                                    if (bwio2 == null) {
                                        bwio2 = bwio.f159659d;
                                    }
                                    bwip bwip = bwio2.f159663c;
                                    if (bwip == null) {
                                        bwip = bwip.f159664e;
                                    }
                                    if ((bwip.f159666a & 1) != 0) {
                                        bkhg.f124211d = bwip.f159667b;
                                    }
                                }
                                formEditText2.mo65972a((bkgj) bkhg);
                            }
                            i3++;
                            i10 = 3;
                        } else {
                            throw new IllegalArgumentException("Error message must be provided for validation.");
                        }
                    }
                    if (!bmqe.f130362k.equals(formEditText.mo71937m())) {
                        formEditText2.mo71832a((CharSequence) bmqe.f130362k, 6);
                    }
                    a3 = bmqa.m108274a(bmqe.f130363l);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    String str11 = bmqe.f130365n;
                    boolean z3 = bmqe.f130366o;
                    formEditText2.f152016an = a3;
                    formEditText2.f151994N = str11;
                    formEditText2.f151995O = z3;
                    formEditText2.mo71916a((View.OnFocusChangeListener) formEditText2);
                    formEditText.mo71961u();
                    int i20 = a3 - 1;
                    if (!(i20 == 0 || i20 == 1)) {
                        formEditText2.setOnFocusChangeListener(formEditText2);
                        if (!formEditText.hasFocus() && !TextUtils.isEmpty(formEditText.getText())) {
                            formEditText.mo71960t();
                            return bmqf2;
                        }
                    }
                }
                z2 = false;
                bmpw bmpw3 = bmpw.UNKNOWN_KEYBOARD_LAYOUT_VARIATION;
                a = bmpu.m108266a(bmqe4.f130359g);
                if (a == 0) {
                }
                i = a - 1;
                if (i == 2) {
                }
                if (m105639a(bmqe4)) {
                }
                while (r6.hasNext()) {
                }
                Typeface typeface2 = formEditText.getTypeface();
                formEditText2.setInputType(i2);
                formEditText2.setTypeface(typeface2);
                if (bmqe4.f130354b != 13) {
                }
                String valueOf3 = String.valueOf(bmnl.f130123e);
                formEditText2.setKeyListener(new bjzd(valueOf3.length() != 0 ? new String("0123456789") : "0123456789".concat(valueOf3), i2));
                a2 = bmpn.m108259a(bmqf2.f130388q);
                if (a2 == 0) {
                }
                if (a2 - 1 == 5) {
                }
                if (bmqf2.f130373b != 6) {
                }
                bxwc bxwc22 = bmqe.f130361j;
                size = bxwc22.size();
                while (i3 < size) {
                }
                if (!bmqe.f130362k.equals(formEditText.mo71937m())) {
                }
                a3 = bmqa.m108274a(bmqe.f130363l);
                if (a3 == 0) {
                }
                String str112 = bmqe.f130365n;
                boolean z32 = bmqe.f130366o;
                formEditText2.f152016an = a3;
                formEditText2.f151994N = str112;
                formEditText2.f151995O = z32;
                formEditText2.mo71916a((View.OnFocusChangeListener) formEditText2);
                formEditText.mo71961u();
                int i202 = a3 - 1;
                formEditText2.setOnFocusChangeListener(formEditText2);
                formEditText.mo71960t();
                return bmqf2;
            } else if (bmqe4.f130362k.isEmpty()) {
                if ((bmqf2.f130372a & 1) != 0) {
                    str7 = bmqf2.f130375d;
                }
                throw new IllegalArgumentException(bkfr.m105591b(str7, "Disabled field must have an initial value."));
            } else {
                formEditText2.mo71832a((CharSequence) bmqe4.f130362k, 6);
                return bmqf2;
            }
        }
        return bmqf2;
    }

    /* renamed from: b */
    public static boolean[] m105643b(bmpl bmpl) {
        int size = bmpl.f130317b.size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            if (((bmpk) bmpl.f130317b.get(i)).f130312m) {
                zArr[i] = true;
            }
        }
        return zArr;
    }

    /* renamed from: c */
    public static void m105645c(View view) {
        View b = m105641b(view);
        if (b instanceof bjwh) {
            ((bjwh) b).mo52947bY();
        }
    }

    /* renamed from: a */
    public static bmqk m105631a(View view, bmqf bmqf) {
        bmpl bmpl;
        String str;
        bmpl bmpl2;
        bmqe bmqe;
        bmqj bmqj;
        int a;
        View b = m105641b(view);
        bxvd da = bmqk.f130403g.mo74144da();
        if ((bmqf.f130372a & 1) != 0 && !bmqf.f130375d.isEmpty()) {
            String str2 = bmqf.f130375d;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmqk bmqk = (bmqk) da.f164949b;
            str2.getClass();
            bmqk.f130405a |= 1;
            bmqk.f130408d = str2;
        }
        if ((bmqf.f130372a & 512) != 0 && bmqf.f130385n.mo73744a() > 0) {
            bxtx bxtx = bmqf.f130385n;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmqk bmqk2 = (bmqk) da.f164949b;
            bxtx.getClass();
            bmqk2.f130405a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bmqk2.f130410f = bxtx;
        }
        if (!((Boolean) bjwe.f123503x.mo54082a()).booleanValue() && (a = bmqo.m108290a(bmqf.f130386o)) != 0 && a == 2) {
            return (bmqk) da.mo74062i();
        }
        int i = bmqf.f130373b;
        if (i == 13) {
            bmpf bmpf = (bmpf) bmqf.f130374c;
            if ((bmpf.f130293a & 1) != 0) {
                String str3 = bmpf.f130294b;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmqk bmqk3 = (bmqk) da.f164949b;
                str3.getClass();
                bmqk3.f130406b = 2;
                bmqk3.f130407c = str3;
            }
        } else if (b instanceof bkhp) {
            bkhp bkhp = (bkhp) b;
            m105636a(da, bmqf, bkhp.mo66001g(), bkhp.mo66002h(), bkhp.mo66003i());
        } else if (i == 16 && (b instanceof TextView)) {
            bmpe bmpe = (bmpe) bmqf.f130374c;
            if ((bmpe.f130281a & 8) != 0) {
                blxc blxc = bmpe.f130285e;
                if (blxc == null) {
                    blxc = blxc.f128037e;
                }
                m105636a(da, bmqf, blxc.f128042d, blxc.f128041c, blxc.f128040b);
            }
        } else if (b instanceof CheckboxView) {
            bmqh g = ((CheckboxView) b).mo71871g();
            if (bmqf.f130377f) {
                String num = Integer.toString(g.f130395e);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmqk bmqk4 = (bmqk) da.f164949b;
                num.getClass();
                bmqk4.f130406b = 8;
                bmqk4.f130407c = num;
            } else {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmqk bmqk5 = (bmqk) da.f164949b;
                bmqk5.f130407c = Integer.valueOf(g.f130395e);
                bmqk5.f130406b = 5;
            }
        } else {
            if (i == 7) {
                bmpl = (bmpl) bmqf.f130374c;
            } else {
                bmpl = bmpl.f130314g;
            }
            if (InlineSelectView.m118617a(bmpl)) {
                InlineSelectView inlineSelectView = (InlineSelectView) b;
                boolean[] zArr = inlineSelectView.f152106f;
                if (zArr != null) {
                    ArrayList arrayList = new ArrayList(zArr.length);
                    int i2 = 0;
                    while (true) {
                        boolean[] zArr2 = inlineSelectView.f152106f;
                        if (i2 >= zArr2.length) {
                            break;
                        }
                        if (zArr2[i2]) {
                            bxvd da2 = bmqi.f130396c.mo74144da();
                            String str4 = ((bmpk) inlineSelectView.f152108h.f130317b.get(i2)).f130306g;
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bmqi bmqi = (bmqi) da2.f164949b;
                            str4.getClass();
                            bmqi.f130398a |= 1;
                            bmqi.f130399b = str4;
                            arrayList.add((bmqi) da2.mo74062i());
                        }
                        i2++;
                    }
                    bxvd da3 = bmqj.f130400b.mo74144da();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bmqj bmqj2 = (bmqj) da3.f164949b;
                    if (!bmqj2.f130402a.mo73666a()) {
                        bmqj2.f130402a = bxvk.m124021a(bmqj2.f130402a);
                    }
                    bxsy.m123078a(arrayList, bmqj2.f130402a);
                    bmqj = (bmqj) da3.mo74062i();
                } else {
                    bmqj = bmqj.f130400b;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmqk bmqk6 = (bmqk) da.f164949b;
                bmqj.getClass();
                bmqk6.f130407c = bmqj;
                bmqk6.f130406b = 11;
            } else {
                byte[] bArr = new byte[0];
                if (b instanceof FormEditText) {
                    FormEditText formEditText = (FormEditText) b;
                    str = formEditText.mo71937m();
                    if (bmqf.f130373b == 6) {
                        bmqe = (bmqe) bmqf.f130374c;
                    } else {
                        bmqe = bmqe.f130351s;
                    }
                    if (bmqe.f130364m && !TextUtils.isEmpty(formEditText.mo71939o())) {
                        String o = formEditText.mo71939o();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bmqk bmqk7 = (bmqk) da.f164949b;
                        o.getClass();
                        bmqk7.f130405a |= 128;
                        bmqk7.f130409e = o;
                    }
                } else if (bkfr.m105616f(b)) {
                    int i3 = bmqf.f130373b;
                    if (i3 == 6) {
                        str = ((bmqe) bmqf.f130374c).f130362k;
                    } else if (i3 == 7) {
                        int a2 = m105627a((bmpl) bmqf.f130374c);
                        if (a2 < 0) {
                            str = "";
                        } else {
                            if (bmqf.f130373b == 7) {
                                bmpl2 = (bmpl) bmqf.f130374c;
                            } else {
                                bmpl2 = bmpl.f130314g;
                            }
                            str = ((bmpk) bmpl2.f130317b.get(a2)).f130306g;
                        }
                    } else if (i3 == 30) {
                        str = String.valueOf(((CountDownTextView) b).mo71873a());
                    } else {
                        throw new IllegalArgumentException(String.format(Locale.US, "Unexpected readonly field: %s", bmqf));
                    }
                } else if (b instanceof FormSpinner) {
                    FormSpinner formSpinner = (FormSpinner) b;
                    str = formSpinner.mo71973c();
                    bArr = new byte[0];
                    Object selectedItem = formSpinner.getSelectedItem();
                    if ((!(formSpinner.getAdapter() instanceof BaseAdapter) || ((BaseAdapter) formSpinner.getAdapter()).isEnabled(formSpinner.getSelectedItemPosition())) && (selectedItem instanceof bkfs)) {
                        bArr = ((bkfs) selectedItem).f124161a;
                    }
                } else if (b instanceof InlineSelectView) {
                    InlineSelectView inlineSelectView2 = (InlineSelectView) b;
                    str = inlineSelectView2.mo72020c();
                    bArr = new byte[0];
                    if (!InlineSelectView.m118617a(inlineSelectView2.f152108h)) {
                        int i4 = inlineSelectView2.f152105e;
                        if (i4 >= 0) {
                            bArr = ((bmpk) inlineSelectView2.f152108h.f130317b.get(i4)).f130307h.mo73780k();
                        }
                    } else {
                        throw new IllegalStateException("getValueDataToken for multi select is not supported.");
                    }
                } else {
                    String valueOf = String.valueOf(b);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                    sb.append("Invalid uiField view: ");
                    sb.append(valueOf);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (bArr.length > 0) {
                    bxtx a3 = bxtx.m123261a(bArr);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bmqk bmqk8 = (bmqk) da.f164949b;
                    a3.getClass();
                    bmqk8.f130406b = 10;
                    bmqk8.f130407c = a3;
                } else if (!bmqf.f130377f) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bmqk bmqk9 = (bmqk) da.f164949b;
                    str.getClass();
                    bmqk9.f130406b = 2;
                    bmqk9.f130407c = str;
                } else {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bmqk bmqk10 = (bmqk) da.f164949b;
                    str.getClass();
                    bmqk10.f130406b = 8;
                    bmqk10.f130407c = str;
                }
            }
        }
        return (bmqk) da.mo74062i();
    }

    /* renamed from: a */
    public static CharSequence m105632a(View view) {
        View b = m105641b(view);
        if (b instanceof TextView) {
            return ((TextView) b).getError();
        }
        if (b instanceof bkdf) {
            return ((bkdf) b).getError();
        }
        if (m105646d(b)) {
            return null;
        }
        String valueOf = String.valueOf(b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("Invalid fieldView view: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static String m105633a(bmpk bmpk) {
        if (!bmpk.f130301b.isEmpty()) {
            return bmpk.f130301b;
        }
        if (!bmpk.f130302c.isEmpty()) {
            return bmpk.f130302c;
        }
        throw new IllegalArgumentException("Each SelectField option must be provided a display value or sensitive display value.");
    }

    /* renamed from: a */
    public static String m105634a(Object obj) {
        if (obj instanceof View) {
            obj = m105641b((View) obj);
        }
        if (obj instanceof bkdw) {
            return ((bkdw) obj).mo52823a(null);
        }
        if (obj instanceof bkbn) {
            return ((bkbn) obj).getText().toString();
        }
        if ((obj instanceof ImageWithCaptionView) || (obj instanceof LinkView)) {
            return "";
        }
        if (obj instanceof View) {
            Integer num = 16;
            if (num.equals(((View) obj).getTag(C0126R.C0129id.field_type))) {
                return "";
            }
        }
        if (obj instanceof TextView) {
            return ((TextView) obj).getText().toString();
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Unexpected field type: %s", obj));
    }

    /* renamed from: a */
    public static void m105635a(View view, String str) {
        View b = m105641b(view);
        if (b instanceof bkdf) {
            ((bkdf) b).mo65794a(str, true);
        } else if (!(b instanceof TextView)) {
            String valueOf = String.valueOf(b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Invalid uiField view: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        } else if (!TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("TextViews should never have an error message");
        }
    }

    /* renamed from: a */
    private static void m105636a(bxvd bxvd, bmqf bmqf, int i, int i2, int i3) {
        bmpe bmpe;
        bmpe bmpe2;
        bmpe bmpe3;
        int i4 = 1;
        if (!bmqf.f130377f) {
            bxvd da = blxc.f128037e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blxc blxc = (blxc) da.f164949b;
            int i5 = blxc.f128039a | 4;
            blxc.f128039a = i5;
            blxc.f128042d = i;
            int i6 = i5 | 2;
            blxc.f128039a = i6;
            blxc.f128041c = i2;
            blxc.f128039a = i6 | 1;
            blxc.f128040b = i3;
            blxc blxc2 = (blxc) da.mo74062i();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bmqk bmqk = (bmqk) bxvd.f164949b;
            bmqk bmqk2 = bmqk.f130403g;
            blxc2.getClass();
            bmqk.f130407c = blxc2;
            bmqk.f130406b = 7;
            return;
        }
        if (bmqf.f130373b == 16) {
            bmpe = (bmpe) bmqf.f130374c;
        } else {
            bmpe = bmpe.f130279k;
        }
        int a = bmpd.m108249a(bmpe.f130282b);
        if (a != 0 && a == 3) {
            String format = String.format(Locale.US, "%02d/%04d", Integer.valueOf(i2), Integer.valueOf(i3));
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bmqk bmqk3 = (bmqk) bxvd.f164949b;
            bmqk bmqk4 = bmqk.f130403g;
            format.getClass();
            bmqk3.f130406b = 8;
            bmqk3.f130407c = format;
            return;
        }
        if (bmqf.f130373b == 16) {
            bmpe2 = (bmpe) bmqf.f130374c;
        } else {
            bmpe2 = bmpe.f130279k;
        }
        int a2 = bmpd.m108249a(bmpe2.f130282b);
        if (a2 != 0 && a2 == 2) {
            String format2 = String.format(Locale.US, "%02d/%02d/%04d", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i3));
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bmqk bmqk5 = (bmqk) bxvd.f164949b;
            bmqk bmqk6 = bmqk.f130403g;
            format2.getClass();
            bmqk5.f130406b = 8;
            bmqk5.f130407c = format2;
            return;
        }
        String str = bmqf.f130375d;
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        if (bmqf.f130373b == 16) {
            bmpe3 = (bmpe) bmqf.f130374c;
        } else {
            bmpe3 = bmpe.f130279k;
        }
        int a3 = bmpd.m108249a(bmpe3.f130282b);
        if (a3 != 0) {
            i4 = a3;
        }
        objArr[0] = Integer.valueOf(i4 - 1);
        throw new IllegalArgumentException(bkfr.m105591b(str, String.format(locale, "DateField.Type %s not supported", objArr)));
    }

    /* renamed from: a */
    public static boolean m105637a(int i, bmqf bmqf) {
        return i == 2 && ((bmqf.f130372a & 32) == 0 || bmqf.f130380i.isEmpty());
    }

    /* renamed from: a */
    public static boolean m105638a(View view, boolean z) {
        View b = m105641b(view);
        if (b instanceof bkdf) {
            return !z ? ((bkdf) b).mo65798cL() : ((bkdf) b).mo65799cM();
        }
        if ((b instanceof TextView) || m105646d(b)) {
            return true;
        }
        String valueOf = String.valueOf(b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Invalid field view: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    static boolean m105639a(bmqe bmqe) {
        int i = Build.VERSION.SDK_INT;
        if (bmqe != null) {
            int a = bmpu.m108266a(bmqe.f130359g);
            if (a != 0 && a == 3) {
                return true;
            }
            int a2 = bmpu.m108266a(bmqe.f130359g);
            if (a2 == 0 || a2 != 5) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m105640a(bmqf bmqf) {
        int a = bmqo.m108290a(bmqf.f130386o);
        if ((a != 0 && a == 2) || (bmqf.f130373b == 7 && ((bmpl) bmqf.f130374c).f130317b.size() == 1)) {
            return true;
        }
        return false;
    }
}
