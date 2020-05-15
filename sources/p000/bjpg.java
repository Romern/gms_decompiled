package p000;

import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.google.android.wallet.bender3.impl.p096ui.common.input.dateinput.DateInputEditText;
import java.util.regex.Matcher;

/* renamed from: bjpg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjpg implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ DateInputEditText f123079a;

    /* renamed from: b */
    private boolean f123080b;

    /* renamed from: c */
    private StringBuilder f123081c;

    /* renamed from: d */
    private int f123082d;

    /* renamed from: e */
    private boolean f123083e = false;

    public bjpg(DateInputEditText dateInputEditText) {
        this.f123079a = dateInputEditText;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [bjgf, bjph], assign insn: 0x012c: IGET  (r1v3 ? I:bjph) = (r4v0 com.google.android.wallet.bender3.impl.ui.common.input.dateinput.DateInputEditText) com.google.android.wallet.bender3.impl.ui.common.input.dateinput.DateInputEditText.g bjph */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        if (r14 != 4) goto L_0x0099;
     */
    public final void afterTextChanged(Editable editable) {
        boolean z;
        boolean z2;
        String str;
        int i;
        String str2;
        if (!this.f123083e) {
            int i2 = 1;
            this.f123083e = true;
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            DateInputEditText dateInputEditText = this.f123079a;
            String[] split = dateInputEditText.f151783b.split(this.f123081c, dateInputEditText.f151782a.size());
            String str3 = "";
            int i3 = 0;
            int i4 = 0;
            while (i3 < split.length) {
                String a = bjzi.m104971a((CharSequence) split[i3]);
                int length = a.length();
                if (!TextUtils.isEmpty(a) || !TextUtils.isEmpty(str3)) {
                    bwvc bwvc = (bwvc) dateInputEditText.f151782a.get(i3);
                    bwvc bwvc2 = bwvc.DATE_COMPONENT_UNKNOWN;
                    int ordinal = bwvc.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != i2) {
                            if (ordinal == 2) {
                                i = 2;
                            } else if (ordinal == 3) {
                                i = 4;
                            }
                            dateInputEditText.f151785d = a;
                            if (length <= i) {
                                if (length < i && !TextUtils.isEmpty(str3)) {
                                    String valueOf = String.valueOf(str3);
                                    String valueOf2 = String.valueOf(a);
                                    dateInputEditText.f151785d = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
                                    str3 = "";
                                    i4 = 1;
                                }
                                str3 = "";
                            } else if (length == 4) {
                                dateInputEditText.f151785d = dateInputEditText.f151785d.substring(2);
                                str3 = "";
                            } else {
                                if (length - i == 1) {
                                    str2 = dateInputEditText.f151785d.substring(i);
                                } else {
                                    str2 = "";
                                }
                                dateInputEditText.f151785d = dateInputEditText.f151785d.substring(0, i);
                                str3 = str2;
                            }
                        }
                        if (bwvc == bwvc.DATE_COMPONENT_DAY) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        String a2 = bjyx.m104946a(a, z2);
                        if (length - a2.length() == 1) {
                            str = a.substring(length - 1);
                        } else {
                            str = "";
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            String valueOf3 = String.valueOf(str3);
                            String valueOf4 = String.valueOf(a2);
                            if (Integer.parseInt(valueOf4.length() == 0 ? new String(valueOf3) : valueOf3.concat(valueOf4)) <= bjyx.m104945a(z2)) {
                                String valueOf5 = String.valueOf(str3);
                                String valueOf6 = String.valueOf(a2);
                                a2 = valueOf6.length() == 0 ? new String(valueOf5) : valueOf5.concat(valueOf6);
                                i4 = 1;
                            }
                        }
                        if (!z2) {
                            dateInputEditText.f151786e = a2;
                        } else {
                            dateInputEditText.f151787f = a2;
                        }
                        str3 = str;
                    } else {
                        throw new IllegalStateException("Date format template contains unknown date component.");
                    }
                }
                i3++;
                i2 = 1;
            }
            ? r1 = dateInputEditText.f151788g;
            ((bjpf) ((bjhy) ((bjpe) ((bjjm) r1).f122830n)).f122754m).mo65430a(dateInputEditText.f151785d, dateInputEditText.f151786e, dateInputEditText.f151787f, r1);
            DateInputEditText dateInputEditText2 = this.f123079a;
            String a3 = bjpj.m104222a(dateInputEditText2.f151784c, dateInputEditText2.f151782a, dateInputEditText2.f151785d, dateInputEditText2.f151786e, dateInputEditText2.f151787f);
            if (!TextUtils.equals(a3, editable.toString())) {
                z = false;
                editable.replace(0, editable.length(), a3);
            } else {
                z = false;
            }
            this.f123083e = z;
            if (selectionStart == selectionEnd) {
                DateInputEditText dateInputEditText3 = this.f123079a;
                int i5 = selectionStart + i4;
                boolean z3 = this.f123080b;
                String obj = dateInputEditText3.getText().toString();
                int length2 = obj.length();
                if (!z3) {
                    if (i5 <= length2 && i5 != 0) {
                        if (bjpj.m104223a((bwvc) dateInputEditText3.f151782a.get(bjyx.m104944a(i5, obj, dateInputEditText3.f151783b)), dateInputEditText3.f151785d, dateInputEditText3.f151786e, dateInputEditText3.f151787f)) {
                            Matcher matcher = dateInputEditText3.f151783b.matcher(obj);
                            if (matcher.find(i5)) {
                                i5 = matcher.end();
                            }
                        }
                        dateInputEditText3.setSelection(Math.min(i5, length2));
                    }
                } else if (i5 <= length2) {
                    if (i5 > 0 && TextUtils.equals(obj.substring(i5 - 1, i5), dateInputEditText3.f151784c)) {
                        i5 -= dateInputEditText3.f151784c.length();
                    }
                    dateInputEditText3.setSelection(Math.min(i5, length2));
                }
                i5 = length2;
                dateInputEditText3.setSelection(Math.min(i5, length2));
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        DateInputEditText dateInputEditText = this.f123079a;
        if (dateInputEditText.f151784c == null || dateInputEditText.f151782a == null) {
            throw new IllegalStateException("Date divider and date format should be provided for formatting the date field.");
        } else if (!this.f123083e) {
            this.f123080b = false;
            dateInputEditText.f151785d = "";
            dateInputEditText.f151786e = "";
            dateInputEditText.f151787f = "";
            this.f123081c = new StringBuilder(charSequence);
            this.f123082d = i;
            if (i2 == 1 && i3 == 0) {
                this.f123080b = true;
                if (TextUtils.equals(this.f123079a.f151784c, charSequence.subSequence(i, i + 1).toString())) {
                    if (i > 0) {
                        this.f123081c.deleteCharAt(i - 1);
                        this.f123082d--;
                        return;
                    }
                    return;
                }
            }
            this.f123081c.delete(i, i2 + i);
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f123083e) {
            this.f123081c.insert(this.f123082d, charSequence, i, i3 + i);
        }
    }
}
