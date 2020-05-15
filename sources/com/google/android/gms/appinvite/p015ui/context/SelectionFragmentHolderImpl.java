package com.google.android.gms.appinvite.p015ui.context;

import android.os.Bundle;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.p015ui.context.section.GridSectionInfo;
import com.google.android.gms.appinvite.p015ui.context.section.ListSectionInfo;
import com.google.android.gms.appinvite.p015ui.context.section.LoaderSectionInfo;
import com.google.android.gms.appinvite.p015ui.context.section.SectionInfo;
import com.google.android.gms.appinvite.p015ui.context.section.SelectionSectionInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.appinvite.ui.context.SelectionFragmentHolderImpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SelectionFragmentHolderImpl extends fww {

    /* renamed from: a */
    private fwo f9771a;

    /* renamed from: a */
    private static final void m6205a(Bundle bundle, SectionInfo sectionInfo) {
        sectionInfo.f9803p = bundle.getBoolean("docked");
    }

    /* renamed from: b */
    public final void mo7287b(int i) {
        fwo fwo = this.f9771a;
        fwo.f17444B = i;
        fyt fyt = fwo.f17480s;
        if (fyt != null) {
            fyt.mo11526a(i);
        }
    }

    /* renamed from: c */
    public final List mo7289c() {
        return this.f9771a.mo11435b();
    }

    /* renamed from: a */
    public final vzr mo7279a() {
        return vzs.m41642a(this.f9771a);
    }

    /* renamed from: a */
    public final void mo7280a(int i) {
        fwo fwo = this.f9771a;
        fwo.f17443A = i;
        fvw fvw = fwo.f17446D;
        if (fvw != null) {
            fvw.f17392c = i;
        }
        fxj fxj = fwo.f17481t;
        if (fxj != null) {
            fxj.mo11469f(fwo.f17443A);
        }
        fxg fxg = fwo.f17482u;
        if (fxg != null) {
            fxg.mo11469f(fwo.f17443A);
        }
    }

    /* renamed from: b */
    public final void mo7288b(ContactPerson contactPerson) {
        List b = this.f9771a.mo11435b();
        int size = b.size();
        int i = 0;
        while (i < size) {
            ContactPerson contactPerson2 = (ContactPerson) b.get(i);
            if (!contactPerson.equals(contactPerson2)) {
                i++;
                if (fzm.m12800d(contactPerson, contactPerson2)) {
                }
            }
            fzm.m12797b(contactPerson2, contactPerson);
            fwo fwo = this.f9771a;
            fwo.f17481t.mo11458b(contactPerson2);
            fxg fxg = fwo.f17482u;
            if (fxg != null) {
                fxg.mo11458b(contactPerson2);
                return;
            }
            return;
        }
    }

    /* renamed from: a */
    public final void mo7281a(ContactPerson contactPerson) {
        List b = this.f9771a.mo11435b();
        int size = b.size();
        int i = 0;
        while (i < size) {
            ContactPerson contactPerson2 = (ContactPerson) b.get(i);
            i++;
            if (contactPerson.equals(contactPerson2)) {
                fwo fwo = this.f9771a;
                fwo.mo11431a(contactPerson2, 0, fwo.mo11441d(contactPerson2));
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c4  */
    /* renamed from: a */
    public final void mo7282a(SelectionFragmentOptions selectionFragmentOptions) {
        ArrayList arrayList;
        char c;
        String str = selectionFragmentOptions.f9772a;
        int i = selectionFragmentOptions.f9773b;
        ArrayList arrayList2 = selectionFragmentOptions.f9774c;
        boolean z = selectionFragmentOptions.f9775d;
        Bundle bundle = selectionFragmentOptions.f9785n;
        boolean z2 = selectionFragmentOptions.f9783l;
        String[] strArr = selectionFragmentOptions.f9776e;
        int i2 = selectionFragmentOptions.f9777f;
        int i3 = selectionFragmentOptions.f9778g;
        String str2 = selectionFragmentOptions.f9779h;
        boolean z3 = selectionFragmentOptions.f9781j;
        boolean z4 = selectionFragmentOptions.f9784m;
        ArrayList arrayList3 = selectionFragmentOptions.f9782k;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size = arrayList3.size();
        int i4 = 0;
        while (i4 < size) {
            ArrayList arrayList5 = arrayList3;
            Bundle bundle2 = (Bundle) arrayList3.get(i4);
            int i5 = size;
            boolean z5 = z4;
            String string = bundle2.getString("type");
            boolean z6 = z3;
            int hashCode = string.hashCode();
            String str3 = str2;
            int i6 = i3;
            if (hashCode != -1715965556) {
                if (hashCode != 3181382) {
                    if (hashCode == 3322014 && string.equals("list")) {
                        c = 2;
                        if (c != 0) {
                            SelectionSectionInfo selectionSectionInfo = new SelectionSectionInfo();
                            m6205a(bundle2, selectionSectionInfo);
                            selectionSectionInfo.f9804a = bundle2.getCharSequence("hintText");
                            selectionSectionInfo.f9805b = bundle2.getBoolean("showCount");
                            arrayList4.add(selectionSectionInfo);
                        } else if (c == 1 || c == 2) {
                            String string2 = bundle2.getString("type");
                            String string3 = bundle2.getString("source");
                            LoaderSectionInfo gridSectionInfo = string2.equals("grid") ? new GridSectionInfo(string3) : new ListSectionInfo(string3);
                            m6205a(bundle2, gridSectionInfo);
                            gridSectionInfo.f9791d = bundle2.getString("loaderOptions");
                            gridSectionInfo.f9794g = bundle2.getString("headerText");
                            gridSectionInfo.f9792e = bundle2.getBoolean("includeInSearch");
                            gridSectionInfo.f9789b = bundle2.getStringArray("methodOrder");
                            arrayList4.add(gridSectionInfo);
                        }
                        i4++;
                        size = i5;
                        arrayList3 = arrayList5;
                        z4 = z5;
                        z3 = z6;
                        str2 = str3;
                        i3 = i6;
                    }
                } else if (string.equals("grid")) {
                    c = 1;
                    if (c != 0) {
                    }
                    i4++;
                    size = i5;
                    arrayList3 = arrayList5;
                    z4 = z5;
                    z3 = z6;
                    str2 = str3;
                    i3 = i6;
                }
            } else if (string.equals("selection")) {
                c = 0;
                if (c != 0) {
                }
                i4++;
                size = i5;
                arrayList3 = arrayList5;
                z4 = z5;
                z3 = z6;
                str2 = str3;
                i3 = i6;
            }
            c = 65535;
            if (c != 0) {
            }
            i4++;
            size = i5;
            arrayList3 = arrayList5;
            z4 = z5;
            z3 = z6;
            str2 = str3;
            i3 = i6;
        }
        int i7 = i3;
        String str4 = str2;
        boolean z7 = z3;
        boolean z8 = z4;
        if (arrayList2 != null) {
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = null;
        }
        this.f9771a = fwo.m12510a(str, i, arrayList, z, bundle, z2, strArr, false, i2, i7, arrayList4, str4, z7, null, null, null, null, z8);
    }

    /* renamed from: a */
    public final void mo7283a(fwr fwr) {
        this.f9771a.f17466e = new fxd(fwr);
    }

    /* renamed from: a */
    public final void mo7284a(fwu fwu) {
        this.f9771a.f17467f = new fxe(fwu);
    }

    /* renamed from: a */
    public final void mo7285a(vzr vzr) {
        this.f9771a = (fwo) vzs.m41641a(vzr);
    }

    /* renamed from: a */
    public final void mo7286a(boolean z) {
        fwo fwo = this.f9771a;
        fwo.f17487z = z;
        fxj fxj = fwo.f17481t;
        if (fxj != null) {
            fxj.mo11463c(z);
        }
        fxg fxg = fwo.f17482u;
        if (fxg != null) {
            fxg.mo11463c(z);
        }
        fwd fwd = fwo.f17447E;
        if (fwd != null) {
            fwd.f17419m = z;
        }
        fvw fvw = fwo.f17446D;
        if (fvw != null) {
            fvw.notifyDataSetChanged();
        }
    }
}
