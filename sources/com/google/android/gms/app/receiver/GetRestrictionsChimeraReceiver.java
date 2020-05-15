package com.google.android.gms.app.receiver;

import android.content.Context;
import android.content.Intent;
import android.content.RestrictionEntry;
import android.os.Bundle;
import com.google.android.chimera.BroadcastReceiver;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetRestrictionsChimeraReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        RestrictionEntry restrictionEntry = new RestrictionEntry("restricted_profile", "true");
        restrictionEntry.setType(0);
        restrictionEntry.setTitle("Restricted profile");
        ArrayList arrayList = new ArrayList();
        arrayList.add(restrictionEntry);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("android.intent.extra.restrictions_list", arrayList);
        setResult(-1, null, bundle);
    }
}
