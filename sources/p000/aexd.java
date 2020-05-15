package p000;

import android.content.Intent;
import android.view.View;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.locationsharing.updateshares.people.LocationSharingSelectionChimeraActivity;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;

/* renamed from: aexd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aexd implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ LocationSharingSelectionChimeraActivity f63973a;

    public aexd(LocationSharingSelectionChimeraActivity locationSharingSelectionChimeraActivity) {
        this.f63973a = locationSharingSelectionChimeraActivity;
    }

    public void onClick(View view) {
        String str;
        LocationSharingSelectionChimeraActivity locationSharingSelectionChimeraActivity = this.f63973a;
        locationSharingSelectionChimeraActivity.f79777b.mo34549a(4, locationSharingSelectionChimeraActivity.f79779d.mo11451a().size());
        LocationSharingSelectionChimeraActivity locationSharingSelectionChimeraActivity2 = this.f63973a;
        ArrayList arrayList = new ArrayList(locationSharingSelectionChimeraActivity2.f79779d.mo11451a());
        Intent intent = new Intent();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ContactPerson contactPerson = (ContactPerson) arrayList.get(i);
            AvatarReference avatarReference = contactPerson.f9752d;
            AudienceMember audienceMember = null;
            if (avatarReference != null) {
                str = avatarReference.f81940b;
            } else {
                str = null;
            }
            ContactPerson.ContactMethod a = contactPerson.mo7263a();
            int i2 = a.f9755a;
            if (i2 == 0) {
                audienceMember = AudienceMember.m22639a(contactPerson.f9750b, contactPerson.f9749a, str);
            } else if (i2 == 1) {
                audienceMember = aexk.m52646b(a.f9756b, contactPerson.f9749a, str);
            } else if (i2 == 2) {
                audienceMember = aexk.m52644a(a.f9756b, contactPerson.f9749a, str);
            }
            if (audienceMember != null) {
                arrayList2.add(audienceMember);
            }
        }
        intent.putParcelableArrayListExtra("extra_added_audience_members", arrayList2);
        locationSharingSelectionChimeraActivity2.setResult(-1, intent);
        locationSharingSelectionChimeraActivity2.finish();
    }
}
