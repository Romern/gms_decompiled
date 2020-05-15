package p000;

import android.app.assist.AssistStructure;
import android.os.LocaleList;
import android.util.Pair;
import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/* renamed from: kbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kbx {
    /* renamed from: a */
    public static kci m17608a(AssistStructure.ViewNode viewNode, AtomicInteger atomicInteger, Map map) {
        int i;
        bxvd da = kci.f23757X.mo74144da();
        float alpha = viewNode.getAlpha();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23782a = alpha;
        if (viewNode.getAutofillHints() != null) {
            String[] autofillHints = viewNode.getAutofillHints();
            for (String str : autofillHints) {
                if (str != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    kci kci = (kci) da.f164949b;
                    str.getClass();
                    if (!kci.f23783b.mo73666a()) {
                        kci.f23783b = GeneratedMessageLite.m124021a(kci.f23783b);
                    }
                    kci.f23783b.add(str);
                }
            }
        }
        map.put(viewNode, Integer.valueOf(atomicInteger.get()));
        int andIncrement = atomicInteger.getAndIncrement();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23784c = andIncrement;
        if (viewNode.getAutofillOptions() != null) {
            CharSequence[] autofillOptions = viewNode.getAutofillOptions();
            for (CharSequence charSequence : autofillOptions) {
                if (!(charSequence == null || charSequence.toString() == null)) {
                    String charSequence2 = charSequence.toString();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    kci kci2 = (kci) da.f164949b;
                    charSequence2.getClass();
                    if (!kci2.f23785d.mo73666a()) {
                        kci2.f23785d = GeneratedMessageLite.m124021a(kci2.f23785d);
                    }
                    kci2.f23785d.add(charSequence2);
                }
            }
        }
        int autofillType = viewNode.getAutofillType();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23786e = autofillType;
        AutofillValue autofillValue = viewNode.getAutofillValue();
        if (autofillValue != null) {
            bxvd da2 = kcd.f23737c.mo74144da();
            if (autofillValue.isDate()) {
                long dateValue = autofillValue.getDateValue();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                kcd kcd = (kcd) da2.f164949b;
                kcd.f23739a = 1;
                kcd.f23740b = Long.valueOf(dateValue);
            } else if (autofillValue.isList()) {
                int listValue = autofillValue.getListValue();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                kcd kcd2 = (kcd) da2.f164949b;
                kcd2.f23739a = 2;
                kcd2.f23740b = Integer.valueOf(listValue);
            } else if (autofillValue.isText()) {
                if (!(autofillValue.getTextValue() == null || autofillValue.getTextValue().toString() == null)) {
                    String charSequence3 = autofillValue.getTextValue().toString();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    kcd kcd3 = (kcd) da2.f164949b;
                    charSequence3.getClass();
                    kcd3.f23739a = 3;
                    kcd3.f23740b = charSequence3;
                }
            } else if (autofillValue.isToggle()) {
                boolean toggleValue = autofillValue.getToggleValue();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                kcd kcd4 = (kcd) da2.f164949b;
                kcd4.f23739a = 4;
                kcd4.f23740b = Boolean.valueOf(toggleValue);
            }
            kcd kcd5 = (kcd) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            kcd5.getClass();
            ((kci) da.f164949b).f23787f = kcd5;
            i = 0;
        } else {
            i = 0;
        }
        while (i < viewNode.getChildCount()) {
            kci a = m17608a(viewNode.getChildAt(i), atomicInteger, map);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            kci kci3 = (kci) da.f164949b;
            a.getClass();
            if (!kci3.f23788g.mo73666a()) {
                kci3.f23788g = GeneratedMessageLite.m124021a(kci3.f23788g);
            }
            kci3.f23788g.add(a);
            i++;
        }
        if (viewNode.getClassName() != null) {
            String className = viewNode.getClassName();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            className.getClass();
            ((kci) da.f164949b).f23789h = className;
        }
        float elevation = viewNode.getElevation();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23790i = elevation;
        int height = viewNode.getHeight();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23791j = height;
        if (viewNode.getHint() != null) {
            String hint = viewNode.getHint();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            hint.getClass();
            ((kci) da.f164949b).f23792k = hint;
        }
        ViewStructure.HtmlInfo htmlInfo = viewNode.getHtmlInfo();
        if (htmlInfo != null) {
            bxvd da3 = kcf.f23745c.mo74144da();
            List<Pair<String, String>> attributes = htmlInfo.getAttributes();
            if (attributes != null) {
                List list = (List) attributes.stream().filter(kbv.f23725a).map(kbw.f23726a).collect(Collectors.toList());
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                kcf kcf = (kcf) da3.f164949b;
                if (!kcf.f23747a.mo73666a()) {
                    kcf.f23747a = GeneratedMessageLite.m124021a(kcf.f23747a);
                }
                bxsy.m123078a(list, kcf.f23747a);
            }
            if (htmlInfo.getTag() != null) {
                String tag = htmlInfo.getTag();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                tag.getClass();
                ((kcf) da3.f164949b).f23748b = tag;
            }
            kcf kcf2 = (kcf) da3.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            kcf2.getClass();
            ((kci) da.f164949b).f23793l = kcf2;
        }
        int id = viewNode.getId();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23794m = id;
        if (viewNode.getIdEntry() != null) {
            String idEntry = viewNode.getIdEntry();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            idEntry.getClass();
            ((kci) da.f164949b).f23795n = idEntry;
        }
        if (viewNode.getIdPackage() != null) {
            String idPackage = viewNode.getIdPackage();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            idPackage.getClass();
            ((kci) da.f164949b).f23796o = idPackage;
        }
        if (viewNode.getIdType() != null) {
            String idType = viewNode.getIdType();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            idType.getClass();
            ((kci) da.f164949b).f23797p = idType;
        }
        int inputType = viewNode.getInputType();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23798q = inputType;
        int left = viewNode.getLeft();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23799r = left;
        LocaleList localeList = viewNode.getLocaleList();
        if (localeList != null) {
            ArrayList arrayList = new ArrayList(localeList.size());
            for (int i2 = 0; i2 < localeList.size(); i2++) {
                Locale locale = localeList.get(i2);
                bxvd da4 = kch.f23752d.mo74144da();
                if (locale.getCountry() != null) {
                    String country = locale.getCountry();
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    country.getClass();
                    ((kch) da4.f164949b).f23754a = country;
                }
                if (locale.getLanguage() != null) {
                    String language = locale.getLanguage();
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    language.getClass();
                    ((kch) da4.f164949b).f23755b = language;
                }
                if (locale.getVariant() != null) {
                    String variant = locale.getVariant();
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    variant.getClass();
                    ((kch) da4.f164949b).f23756c = variant;
                }
                arrayList.add((kch) da4.mo74062i());
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            kci kci4 = (kci) da.f164949b;
            if (!kci4.f23800s.mo73666a()) {
                kci4.f23800s = GeneratedMessageLite.m124021a(kci4.f23800s);
            }
            bxsy.m123078a(arrayList, kci4.f23800s);
        }
        int scrollX = viewNode.getScrollX();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23801t = scrollX;
        int scrollY = viewNode.getScrollY();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23802u = scrollY;
        if (!(viewNode.getText() == null || viewNode.getText().toString() == null)) {
            String charSequence4 = viewNode.getText().toString();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            charSequence4.getClass();
            ((kci) da.f164949b).f23803v = charSequence4;
        }
        int textBackgroundColor = viewNode.getTextBackgroundColor();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23804w = textBackgroundColor;
        int textColor = viewNode.getTextColor();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23805x = textColor;
        if (viewNode.getTextLineBaselines() != null) {
            List b = bqcn.m112586b(viewNode.getTextLineBaselines());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            kci kci5 = (kci) da.f164949b;
            if (!kci5.f23806y.mo73666a()) {
                kci5.f23806y = GeneratedMessageLite.m124019a(kci5.f23806y);
            }
            bxsy.m123078a(b, kci5.f23806y);
        }
        if (viewNode.getTextLineCharOffsets() != null) {
            List b2 = bqcn.m112586b(viewNode.getTextLineCharOffsets());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            kci kci6 = (kci) da.f164949b;
            if (!kci6.f23807z.mo73666a()) {
                kci6.f23807z = GeneratedMessageLite.m124019a(kci6.f23807z);
            }
            bxsy.m123078a(b2, kci6.f23807z);
        }
        int textSelectionEnd = viewNode.getTextSelectionEnd();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23759A = textSelectionEnd;
        int textSelectionStart = viewNode.getTextSelectionStart();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23760B = textSelectionStart;
        float textSize = viewNode.getTextSize();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23761C = textSize;
        int textStyle = viewNode.getTextStyle();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23762D = textStyle;
        int top = viewNode.getTop();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23763E = top;
        int visibility = viewNode.getVisibility();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23764F = visibility;
        if (viewNode.getWebDomain() != null) {
            String webDomain = viewNode.getWebDomain();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            webDomain.getClass();
            ((kci) da.f164949b).f23765G = webDomain;
        }
        int width = viewNode.getWidth();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23766H = width;
        boolean isAccessibilityFocused = viewNode.isAccessibilityFocused();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23767I = isAccessibilityFocused;
        boolean isAssistBlocked = viewNode.isAssistBlocked();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23768J = isAssistBlocked;
        boolean isCheckable = viewNode.isCheckable();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23769K = isCheckable;
        boolean isChecked = viewNode.isChecked();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23770L = isChecked;
        boolean isClickable = viewNode.isClickable();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23771M = isClickable;
        boolean isContextClickable = viewNode.isContextClickable();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23772N = isContextClickable;
        boolean isEnabled = viewNode.isEnabled();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23773O = isEnabled;
        boolean isFocusable = viewNode.isFocusable();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23774P = isFocusable;
        boolean isFocused = viewNode.isFocused();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23775Q = isFocused;
        boolean isLongClickable = viewNode.isLongClickable();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23776R = isLongClickable;
        boolean isOpaque = viewNode.isOpaque();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23777S = isOpaque;
        boolean isSelected = viewNode.isSelected();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kci) da.f164949b).f23778T = isSelected;
        return (kci) da.mo74062i();
    }
}
