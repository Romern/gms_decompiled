package p000;

import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.wallet.p097ui.common.DateEditText;
import java.util.regex.Matcher;

/* renamed from: bkck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkck implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ DateEditText f123999a;

    /* renamed from: b */
    private boolean f124000b;

    /* renamed from: c */
    private StringBuilder f124001c;

    /* renamed from: d */
    private int f124002d;

    /* renamed from: e */
    private boolean f124003e = false;

    /* renamed from: f */
    private String f124004f;

    /* renamed from: g */
    private boolean f124005g;

    /* renamed from: h */
    private int f124006h;

    /* renamed from: i */
    private int f124007i;

    /* renamed from: j */
    private int f124008j;

    public bkck(DateEditText dateEditText) {
        this.f123999a = dateEditText;
    }

    public final void afterTextChanged(Editable editable) {
        String str;
        String str2;
        String str3;
        String str4;
        if (!this.f124003e) {
            DateEditText dateEditText = this.f123999a;
            String[] split = dateEditText.f151932a.split(this.f124001c, dateEditText.f151941j);
            String str5 = "";
            String str6 = str5;
            String str7 = str6;
            String str8 = str7;
            int i = 0;
            int i2 = 0;
            while (true) {
                int length = split.length;
                if (i > length) {
                    break;
                }
                if (i < length) {
                    str = bjyw.m104938a((CharSequence) split[i]);
                } else {
                    str = "";
                }
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str8)) {
                    int length2 = str.length();
                    if (i == dateEditText.f151938g) {
                        str6 = bjyx.m104946a(str, true);
                        if (length2 - str6.length() == 1) {
                            str2 = str.substring(length2 - 1);
                        } else {
                            str2 = "";
                        }
                        if (!TextUtils.isEmpty(str8)) {
                            String valueOf = String.valueOf(str8);
                            String valueOf2 = String.valueOf(str6);
                            if (Integer.parseInt(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2)) <= 31) {
                                String valueOf3 = String.valueOf(str8);
                                String valueOf4 = String.valueOf(str6);
                                str6 = valueOf4.length() == 0 ? new String(valueOf3) : valueOf3.concat(valueOf4);
                                str8 = str2;
                                i2 = 1;
                            }
                        }
                    } else if (i == dateEditText.f151939h) {
                        str5 = bjyx.m104946a(str, false);
                        if (length2 - str5.length() == 1) {
                            str4 = str.substring(length2 - 1);
                        } else {
                            str4 = "";
                        }
                        if (!TextUtils.isEmpty(str8)) {
                            String valueOf5 = String.valueOf(str8);
                            String valueOf6 = String.valueOf(str5);
                            if (Integer.parseInt(valueOf6.length() == 0 ? new String(valueOf5) : valueOf5.concat(valueOf6)) <= 12) {
                                String valueOf7 = String.valueOf(str8);
                                String valueOf8 = String.valueOf(str5);
                                str5 = valueOf8.length() == 0 ? new String(valueOf7) : valueOf7.concat(valueOf8);
                                str8 = str2;
                                i2 = 1;
                            }
                        }
                    } else if (i != dateEditText.f151940i) {
                        str8 = "";
                    } else {
                        int i3 = dateEditText.f151942k;
                        if (length2 > i3) {
                            if (length2 == 4 && i3 == 2) {
                                str7 = str.substring(2);
                                str8 = "";
                            } else {
                                if (length2 - i3 != 1) {
                                    str3 = "";
                                } else {
                                    str3 = str.substring(i3);
                                }
                                str8 = str3;
                                str7 = str.substring(0, dateEditText.f151942k);
                            }
                        } else if (length2 < i3 && !TextUtils.isEmpty(str8)) {
                            String valueOf9 = String.valueOf(str8);
                            String valueOf10 = String.valueOf(str);
                            str7 = valueOf10.length() == 0 ? new String(valueOf9) : valueOf9.concat(valueOf10);
                            i2 = 1;
                            str8 = "";
                        } else {
                            str8 = "";
                            str7 = str;
                        }
                    }
                    str8 = str2;
                }
                i++;
            }
            dateEditText.f151935d = str5;
            dateEditText.f151934c = str6;
            dateEditText.f151936e = str7;
            String j = this.f123999a.mo71885j();
            this.f124003e = true;
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (!j.equals(editable.toString())) {
                editable.replace(0, editable.length(), j);
            }
            if (this.f124005g) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(16);
                obtain.setBeforeText(this.f124004f);
                obtain.setFromIndex(this.f124006h);
                obtain.setAddedCount(this.f124007i);
                obtain.setRemovedCount(this.f124008j);
                this.f123999a.sendAccessibilityEventUnchecked(obtain);
            }
            this.f124003e = false;
            this.f124005g = false;
            if (selectionStart == selectionEnd) {
                DateEditText dateEditText2 = this.f123999a;
                int i4 = selectionStart + i2;
                boolean z = this.f124000b;
                String obj = dateEditText2.getText().toString();
                int length3 = obj.length();
                if (z) {
                    if (i4 <= length3) {
                        if (i4 > 0 && obj.substring(i4 - 1, i4).equals(dateEditText2.f151933b)) {
                            i4 -= dateEditText2.f151933b.length();
                        }
                        dateEditText2.setSelection(Math.min(i4, dateEditText2.getText().length()));
                    }
                } else if (i4 <= length3 && i4 != 0) {
                    int a = bjyx.m104944a(i4, obj, dateEditText2.f151932a);
                    if ((a == dateEditText2.f151938g && bjyx.m104948b(dateEditText2.f151934c)) || ((a == dateEditText2.f151939h && bjyx.m104947a(dateEditText2.f151935d)) || (a == dateEditText2.f151940i && dateEditText2.f151936e.length() == dateEditText2.f151942k))) {
                        Matcher matcher = dateEditText2.f151932a.matcher(obj);
                        if (matcher.find(i4)) {
                            i4 = matcher.end();
                        }
                    }
                    dateEditText2.setSelection(Math.min(i4, dateEditText2.getText().length()));
                }
                i4 = length3;
                dateEditText2.setSelection(Math.min(i4, dateEditText2.getText().length()));
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f124003e) {
            this.f124004f = charSequence.toString();
            this.f123999a.f151937f = false;
            this.f124006h = -1;
            this.f124007i = -1;
            this.f124008j = -1;
            this.f124000b = false;
            this.f124001c = new StringBuilder(charSequence);
            this.f124002d = i;
            if (i2 == 1 && i3 == 0) {
                this.f124000b = true;
                if (this.f123999a.f151933b.equals(charSequence.subSequence(i, i + 1).toString())) {
                    if (i > 0) {
                        int i4 = i - 1;
                        this.f124001c.deleteCharAt(i4);
                        this.f124002d--;
                        this.f124005g = true;
                        this.f124006h = i4;
                        this.f124007i = 0;
                        this.f124008j = 1;
                    }
                    this.f123999a.f151937f = true;
                    return;
                }
            }
            this.f124001c.delete(i, i2 + i);
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f124003e) {
            this.f124001c.insert(this.f124002d, charSequence, i, i3 + i);
        }
    }
}
