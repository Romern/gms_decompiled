package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing;
import java.util.Arrays;

/* renamed from: abyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abyc {
    /* renamed from: a */
    public static Thing m48524a(Thing thing) {
        String str;
        Thing thing2 = thing;
        boolean[] c = thing2.f152371c.mo72361c("isGlobalSearchable");
        if (!(c == null || c.length == 0 || c[0])) {
            thing2.f152371c.f152377d.putLongArray("scope", new long[]{1});
        }
        if (thing2.f152369a == 10 && !thing2.f152373e.equals("Reservation")) {
            return thing2;
        }
        Bundle bundle = new Bundle(thing2.f152370b);
        String str2 = thing2.f152373e;
        if (str2.equals("Reservation")) {
            m48525a(bundle, "startTime", "startDate");
        }
        for (String str3 : bundle.keySet()) {
            Object obj = bundle.get(str3);
            if (obj instanceof Parcelable[]) {
                Parcelable[] parcelableArr = (Parcelable[]) obj;
                Thing[] thingArr = new Thing[parcelableArr.length];
                for (int i = 0; i < parcelableArr.length; i++) {
                    thingArr[i] = m48524a((Thing) parcelableArr[i]);
                }
                bundle.putParcelableArray(str3, thingArr);
            }
        }
        int i2 = thing2.f152369a;
        if (i2 == 1) {
            if (thing2.f152373e.equals("Person")) {
                m48525a(bundle, "text", "email");
            }
            if (Arrays.asList("Document", "PresentationDocument", "NoteDocument", "TextDocument", "SpreadsheetDocument").contains(thing2.f152373e)) {
                m48525a(bundle, "hasDocumentPermission", "hasDigitalDocumentPermission");
            }
            String[] strArr = {"Document", "PresentationDocument", "NoteDocument", "TextDocument", "SpreadsheetDocument", "DocumentPermission"};
            String[] strArr2 = {"DigitalDocument", "PresentationDigitalDocument", "NoteDigitalDocument", "TextDigitalDocument", "SpreadsheetDigitalDocument", "DigitalDocumentPermission"};
            int i3 = 0;
            for (int i4 = 6; i3 < i4; i4 = 6) {
                if (thing2.f152373e.equals(strArr[i3])) {
                    str2 = strArr2[i3];
                }
                i3++;
            }
        } else if (i2 != 2) {
            str = str2;
            return new Thing(thing2.f152369a, bundle, thing2.f152371c, thing2.f152372d, str);
        }
        if (Arrays.asList("File", "PresentationFile", "NoteFile", "TextFile", "SpreadsheetFile").contains(thing2.f152373e)) {
            m48525a(bundle, "hasFilePermission", "hasDigitalDocumentPermission");
        }
        String[] strArr3 = {"File", "PresentationFile", "NoteFile", "TextFile", "SpreadsheetFile", "FilePermission"};
        String[] strArr4 = {"DigitalDocument", "PresentationDigitalDocument", "NoteDigitalDocument", "TextDigitalDocument", "SpreadsheetDigitalDocument", "DigitalDocumentPermission"};
        for (int i5 = 0; i5 < 6; i5++) {
            if (thing2.f152373e.equals(strArr3[i5])) {
                str2 = strArr4[i5];
            }
        }
        str = str2;
        return new Thing(thing2.f152369a, bundle, thing2.f152371c, thing2.f152372d, str);
    }

    /* renamed from: a */
    private static void m48525a(Bundle bundle, String str, String str2) {
        if (bundle.get(str) instanceof String[]) {
            bundle.putStringArray(str2, bundle.getStringArray(str));
            bundle.remove(str);
        } else if (bundle.get(str) instanceof Parcelable[]) {
            bundle.putParcelableArray(str2, bundle.getParcelableArray(str));
            bundle.remove(str);
        } else if (bundle.get(str) instanceof long[]) {
            bundle.putLongArray(str2, bundle.getLongArray(str));
            bundle.remove(str);
        }
    }
}
