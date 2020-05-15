package p000;

import android.text.Editable;
import android.text.Html;
import com.google.android.gms.family.common.HelpLinkSpan;
import com.google.android.gms.family.p042v2.model.HelpData;
import com.google.android.gms.family.p042v2.model.PageData;
import org.xml.sax.XMLReader;

/* renamed from: wgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wgt implements Html.TagHandler {

    /* renamed from: a */
    private final PageData f50628a;

    /* renamed from: b */
    private final wgr f50629b;

    /* renamed from: c */
    private final String f50630c;

    public wgt(PageData pageData, wgr wgr, String str) {
        this.f50628a = pageData;
        this.f50629b = wgr;
        this.f50630c = str;
    }

    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        if (str.startsWith("help-")) {
            String substring = str.substring(5);
            if (this.f50628a.f31454b.containsKey(substring)) {
                String str2 = ((HelpData) this.f50628a.f31454b.get(substring)).f31452b;
                String str3 = ((HelpData) this.f50628a.f31454b.get(substring)).f31451a;
                if (!stm.m36302d(str2) && !stm.m36302d(str3)) {
                    int length = editable.length();
                    if (!z) {
                        wgs[] wgsArr = (wgs[]) editable.getSpans(0, length, wgs.class);
                        int length2 = wgsArr.length;
                        if (length2 != 0) {
                            wgs wgs = wgsArr[length2 - 1];
                            int spanStart = editable.getSpanStart(wgs);
                            editable.removeSpan(wgs);
                            if (spanStart != length) {
                                editable.setSpan(new HelpLinkSpan(this.f50629b, str2, str3, this.f50630c), spanStart, length, 33);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    editable.setSpan(new wgs(), length, length, 17);
                }
            }
        }
    }
}
