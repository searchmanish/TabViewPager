package com.softcodeinfotech.tabviewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class OrdersPageAdapter extends FragmentStateAdapter {
    public OrdersPageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position)
        {
            case 0:
                return new PendingOrderFragment();
            case 1:
                return new ConfirmedOrderFragment();
            default:
                return new DeliveredOrderFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
