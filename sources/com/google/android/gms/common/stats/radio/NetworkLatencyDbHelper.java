package com.google.android.gms.common.stats.radio;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetworkLatencyDbHelper extends SQLiteOpenHelper {
    public NetworkLatencyDbHelper(Context context) {
        super(context, NetworkLatencyContract.DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(NetworkLatencyContract.CREATE_NETWORK_LATENCY_TABLE);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL(NetworkLatencyContract.DROP_NETWORK_LATENCY_TABLE);
        sQLiteDatabase.execSQL(NetworkLatencyContract.CREATE_NETWORK_LATENCY_TABLE);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
